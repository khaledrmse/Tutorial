package com.softsolution;

public class GetCredit {
	private double demande;
	private double store;
	
	
	
	public void getDemand (double demande) throws InsuffusantAmmont
	{
		if (demande <store )
		{
			
		}else
		{
			double diff= store-demande;
			throw new InsuffusantAmmont(diff);
		}
	}
	

	public double getStore() {
		return store;
	}


	public void setStore(double store) {
		this.store = store;
	}


	public GetCredit(double demande, double store) {
		super();
		this.demande = demande;
		this.store = store;
	}

	@Override
	public String toString() {
		return "GetCredit [demande=" + demande + "]";
	}

	public double getDemande() {
		return demande;
	}

	public void setDemande(double demande) {
		this.demande = demande;
	}
	
	

}
