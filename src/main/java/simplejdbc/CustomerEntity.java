package simplejdbc;

/**
 * Correspond à un enregistrement de la table Customer
 */
public class CustomerEntity {
	// TODO : ajouter les autres propriétés
	private int customerId;
        private String discount_code;
        private int zip;
	private String name;
	private String addressLine1;
        private String addressLine2;
        private String city;
        private String state;
        private String phone;
        private String fax;
        private String email;
        private int credit_limit;
        
        

	public CustomerEntity(int customerId, String name, String addressLine1, String discount_code,int zip,String addressLine2,
                String city, String state, String phone, String fax, String email, int credit_limit) {
            
		this.customerId = customerId;
                this.discount_code = discount_code;
                this.zip = zip;
		this.name = name;
		this.addressLine1 = addressLine1;
                this.addressLine2 = addressLine2;
                this.city = city;
                this.state = state;
                this.phone = phone;
                this.fax = fax;
                this.email = email;
                this.credit_limit = credit_limit;            
	}

	public int getCustomerId() {
		return customerId;
	}
        
        public String getDiscount_code() {
		return discount_code;
	}
        
        public int getZip() {
		return zip;
	}

	public String getName() {
		return name;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}
        
        public String getCity() {
		return city;
	}
        
	public String getState() {
		return state;
	}
        
	public String getPhone() {
		return phone;
	}
        
	public String getFax() {
		return fax;
	}
        
	public String getEmail() {
		return email;
	}
        
	public int getCredit_limit() {
		return credit_limit;
	}
}
