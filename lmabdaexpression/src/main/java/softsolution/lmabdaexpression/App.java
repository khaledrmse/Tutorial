package softsolution.lmabdaexpression;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
 

public class App 
{
    public static void main( String[] args )
    {
    List<Person> list = new ArrayList<>();
    list.add(new Person("khaled", "slimani", 32));
    list.add(new Person("omar", "sahed", 36));    
    list.add(new Person("tayeb", "kifouch", 33));   
    list.add(new Person("oussama", "chaouch", 26));  
    list.add(new Person("abd el majid", "amri", 26)); 
    //dispaly person that have age >30
    List< Person> listPerson =new ArrayList<>();
    for (Person person : list) {
		if (person.getAge()>30) {
			listPerson.add(person);
		}
	}
    
   //listPerson.forEach(p->System.out.println(p.toString()));
   //or
   //listPerson.forEach(System.out::print);
   //use strem to filter the persons that have age >30
   List <Person>l=list.stream()
   				.filter(p->p.getAge()>30)
   				.collect(Collectors.toList());
 
    l.forEach(p->System.out.println(p.toString()));
	//sort   
    System.out.println("------------------------------------");
    List <Person> sortedListByAge=list.stream()
    		.sorted(Comparator.comparing(Person::getAge))
    		.collect(Collectors.toList());	
    sortedListByAge.forEach(p->System.out.println(p));
   //Allmatch 				
    System.out.println("------------------------------------");
    boolean b=list.stream()
    	.allMatch(p->p.getAge()>20);
    System.out.println(b);
    //Anymatch 				
    System.out.println("------------------------------------");
    boolean bb=list.stream()
    	.anyMatch(p->p.getAge()>30);
    System.out.println(bb);
    System.out.println("------------------------------------");
    //nomatch
    boolean bbs= list.stream()
    		.noneMatch(p->p.getName().equals("khaled"));
    
    System.out.println(bbs);
    System.out.println("------------------------------------");
    //min
   Optional<Person> min = list.stream()
    .min(Comparator.comparing(Person::getAge));
    System.out.println(min.toString());
    System.out.println("------------------------------------");
    //max
    list.stream()
    	.max(Comparator.comparing(Person::getAge))
    	.ifPresent(System.out::println);
 
    //group
    System.out.println("------------------------------------");
 Map<Integer, List<Person>> group = list.stream()
   		.collect(Collectors.groupingBy(Person::getAge));
        group.forEach((age,person)->System.out.println(person));	
    }
    
	} 


 
