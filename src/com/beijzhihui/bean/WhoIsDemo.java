package com.beijzhihui.bean;


public class WhoIsDemo {
	private Long id;
	private String domain;
	private String registrar;
	private String reg_email;
	private String registrar_whois_server;
	private String name_server;
	private String reg_date;
	private String updated_date;
	private String expir_date;
	private String domain_status;
	private String registrar_abuse_contact_email;
	private String reg_name;
	private String registrant_organization;
	private String registrant_street1;
	private String registrant_street2;
	private String registrant_street3;
	private String registrant_street4;
	private String registrant_city;
	private String registrant_state_province;
	private String registrant_postal_code;
	private String reg_country;
	private String reg_fax;
	private String registrant_fax_ext;
	private String registrar_abuse_contact_phone;
	private String registrant_phone_ext;
	private String adm_email;
	private String adm_name;
	private String admin_organization;
	private String administrativeContact_street1;
	private String administrativeContact_street2;
	private String administrativeContact_street3;
	private String administrativeContact_street4;
	private String admin_city;
	private String admin_state_province;
	private String admin_postal_code;
	private String adm_country;
	private String adm_fax;
	private String admin_fax_ext;
	private String adm_phone;
	private String admin_phone_ext;
	private String tech_email;
	private String tech_name;
	private String tech_organization;
	private String technicalContact_street1;
	private String technicalContact_street2;
	private String technicalContact_street3;
	private String technicalContact_street4;
	private String tech_city;
	private String tech_state_province;
	private String tech_postal_code;
	private String tech_country;
	private String tech_fax;
	private String tech_fax_ext;
	private String tech_phone;
	private String tech_phone_ext;
	private String registrar_IANA_id;
	public WhoIsDemo(Long id, String domain, String registrar, String reg_email, String registrar_whois_server,
			String name_server, String reg_date, String updated_date, String expir_date, String domain_status,
			String registrar_abuse_contact_email, String reg_name, String registrant_organization,
			String registrant_street1, String registrant_street2, String registrant_street3, String registrant_street4,
			String registrant_city, String registrant_state_province, String registrant_postal_code, String reg_country,
			String reg_fax, String registrant_fax_ext, String registrar_abuse_contact_phone,
			String registrant_phone_ext, String adm_email, String adm_name, String admin_organization,
			String administrativeContact_street1, String administrativeContact_street2,
			String administrativeContact_street3, String administrativeContact_street4, String admin_city,
			String admin_state_province, String admin_postal_code, String adm_country, String adm_fax,
			String admin_fax_ext, String adm_phone, String admin_phone_ext, String tech_email, String tech_name,
			String tech_organization, String technicalContact_street1, String technicalContact_street2,
			String technicalContact_street3, String technicalContact_street4, String tech_city,
			String tech_state_province, String tech_postal_code, String tech_country, String tech_fax,
			String tech_fax_ext, String tech_phone, String tech_phone_ext, String registrar_IANA_id) {
		super();
		this.id = id;
		this.domain = domain;
		this.registrar = registrar;
		this.reg_email = reg_email;
		this.registrar_whois_server = registrar_whois_server;
		this.name_server = name_server;
		this.reg_date = reg_date;
		this.updated_date = updated_date;
		this.expir_date = expir_date;
		this.domain_status = domain_status;
		this.registrar_abuse_contact_email = registrar_abuse_contact_email;
		this.reg_name = reg_name;
		this.registrant_organization = registrant_organization;
		this.registrant_street1 = registrant_street1;
		this.registrant_street2 = registrant_street2;
		this.registrant_street3 = registrant_street3;
		this.registrant_street4 = registrant_street4;
		this.registrant_city = registrant_city;
		this.registrant_state_province = registrant_state_province;
		this.registrant_postal_code = registrant_postal_code;
		this.reg_country = reg_country;
		this.reg_fax = reg_fax;
		this.registrant_fax_ext = registrant_fax_ext;
		this.registrar_abuse_contact_phone = registrar_abuse_contact_phone;
		this.registrant_phone_ext = registrant_phone_ext;
		this.adm_email = adm_email;
		this.adm_name = adm_name;
		this.admin_organization = admin_organization;
		this.administrativeContact_street1 = administrativeContact_street1;
		this.administrativeContact_street2 = administrativeContact_street2;
		this.administrativeContact_street3 = administrativeContact_street3;
		this.administrativeContact_street4 = administrativeContact_street4;
		this.admin_city = admin_city;
		this.admin_state_province = admin_state_province;
		this.admin_postal_code = admin_postal_code;
		this.adm_country = adm_country;
		this.adm_fax = adm_fax;
		this.admin_fax_ext = admin_fax_ext;
		this.adm_phone = adm_phone;
		this.admin_phone_ext = admin_phone_ext;
		this.tech_email = tech_email;
		this.tech_name = tech_name;
		this.tech_organization = tech_organization;
		this.technicalContact_street1 = technicalContact_street1;
		this.technicalContact_street2 = technicalContact_street2;
		this.technicalContact_street3 = technicalContact_street3;
		this.technicalContact_street4 = technicalContact_street4;
		this.tech_city = tech_city;
		this.tech_state_province = tech_state_province;
		this.tech_postal_code = tech_postal_code;
		this.tech_country = tech_country;
		this.tech_fax = tech_fax;
		this.tech_fax_ext = tech_fax_ext;
		this.tech_phone = tech_phone;
		this.tech_phone_ext = tech_phone_ext;
		this.registrar_IANA_id = registrar_IANA_id;
	}
	public WhoIsDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getRegistrar() {
		return registrar;
	}
	public void setRegistrar(String registrar) {
		this.registrar = registrar;
	}
	public String getReg_email() {
		return reg_email;
	}
	public void setReg_email(String reg_email) {
		this.reg_email = reg_email;
	}
	public String getRegistrar_whois_server() {
		return registrar_whois_server;
	}
	public void setRegistrar_whois_server(String registrar_whois_server) {
		this.registrar_whois_server = registrar_whois_server;
	}
	public String getName_server() {
		return name_server;
	}
	public void setName_server(String name_server) {
		this.name_server = name_server;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	public String getUpdated_date() {
		return updated_date;
	}
	public void setUpdated_date(String updated_date) {
		this.updated_date = updated_date;
	}
	public String getExpir_date() {
		return expir_date;
	}
	public void setExpir_date(String expir_date) {
		this.expir_date = expir_date;
	}
	public String getDomain_status() {
		return domain_status;
	}
	public void setDomain_status(String domain_status) {
		this.domain_status = domain_status;
	}
	public String getRegistrar_abuse_contact_email() {
		return registrar_abuse_contact_email;
	}
	public void setRegistrar_abuse_contact_email(String registrar_abuse_contact_email) {
		this.registrar_abuse_contact_email = registrar_abuse_contact_email;
	}
	public String getReg_name() {
		return reg_name;
	}
	public void setReg_name(String reg_name) {
		this.reg_name = reg_name;
	}
	public String getRegistrant_organization() {
		return registrant_organization;
	}
	public void setRegistrant_organization(String registrant_organization) {
		this.registrant_organization = registrant_organization;
	}
	public String getRegistrant_street1() {
		return registrant_street1;
	}
	public void setRegistrant_street1(String registrant_street1) {
		this.registrant_street1 = registrant_street1;
	}
	public String getRegistrant_street2() {
		return registrant_street2;
	}
	public void setRegistrant_street2(String registrant_street2) {
		this.registrant_street2 = registrant_street2;
	}
	public String getRegistrant_street3() {
		return registrant_street3;
	}
	public void setRegistrant_street3(String registrant_street3) {
		this.registrant_street3 = registrant_street3;
	}
	public String getRegistrant_street4() {
		return registrant_street4;
	}
	public void setRegistrant_street4(String registrant_street4) {
		this.registrant_street4 = registrant_street4;
	}
	public String getRegistrant_city() {
		return registrant_city;
	}
	public void setRegistrant_city(String registrant_city) {
		this.registrant_city = registrant_city;
	}
	public String getRegistrant_state_province() {
		return registrant_state_province;
	}
	public void setRegistrant_state_province(String registrant_state_province) {
		this.registrant_state_province = registrant_state_province;
	}
	public String getRegistrant_postal_code() {
		return registrant_postal_code;
	}
	public void setRegistrant_postal_code(String registrant_postal_code) {
		this.registrant_postal_code = registrant_postal_code;
	}
	public String getReg_country() {
		return reg_country;
	}
	public void setReg_country(String reg_country) {
		this.reg_country = reg_country;
	}
	public String getReg_fax() {
		return reg_fax;
	}
	public void setReg_fax(String reg_fax) {
		this.reg_fax = reg_fax;
	}
	public String getRegistrant_fax_ext() {
		return registrant_fax_ext;
	}
	public void setRegistrant_fax_ext(String registrant_fax_ext) {
		this.registrant_fax_ext = registrant_fax_ext;
	}
	public String getRegistrar_abuse_contact_phone() {
		return registrar_abuse_contact_phone;
	}
	public void setRegistrar_abuse_contact_phone(String registrar_abuse_contact_phone) {
		this.registrar_abuse_contact_phone = registrar_abuse_contact_phone;
	}
	public String getRegistrant_phone_ext() {
		return registrant_phone_ext;
	}
	public void setRegistrant_phone_ext(String registrant_phone_ext) {
		this.registrant_phone_ext = registrant_phone_ext;
	}
	public String getAdm_email() {
		return adm_email;
	}
	public void setAdm_email(String adm_email) {
		this.adm_email = adm_email;
	}
	public String getAdm_name() {
		return adm_name;
	}
	public void setAdm_name(String adm_name) {
		this.adm_name = adm_name;
	}
	public String getAdmin_organization() {
		return admin_organization;
	}
	public void setAdmin_organization(String admin_organization) {
		this.admin_organization = admin_organization;
	}
	public String getAdministrativeContact_street1() {
		return administrativeContact_street1;
	}
	public void setAdministrativeContact_street1(String administrativeContact_street1) {
		this.administrativeContact_street1 = administrativeContact_street1;
	}
	public String getAdministrativeContact_street2() {
		return administrativeContact_street2;
	}
	public void setAdministrativeContact_street2(String administrativeContact_street2) {
		this.administrativeContact_street2 = administrativeContact_street2;
	}
	public String getAdministrativeContact_street3() {
		return administrativeContact_street3;
	}
	public void setAdministrativeContact_street3(String administrativeContact_street3) {
		this.administrativeContact_street3 = administrativeContact_street3;
	}
	public String getAdministrativeContact_street4() {
		return administrativeContact_street4;
	}
	public void setAdministrativeContact_street4(String administrativeContact_street4) {
		this.administrativeContact_street4 = administrativeContact_street4;
	}
	public String getAdmin_city() {
		return admin_city;
	}
	public void setAdmin_city(String admin_city) {
		this.admin_city = admin_city;
	}
	public String getAdmin_state_province() {
		return admin_state_province;
	}
	public void setAdmin_state_province(String admin_state_province) {
		this.admin_state_province = admin_state_province;
	}
	public String getAdmin_postal_code() {
		return admin_postal_code;
	}
	public void setAdmin_postal_code(String admin_postal_code) {
		this.admin_postal_code = admin_postal_code;
	}
	public String getAdm_country() {
		return adm_country;
	}
	public void setAdm_country(String adm_country) {
		this.adm_country = adm_country;
	}
	public String getAdm_fax() {
		return adm_fax;
	}
	public void setAdm_fax(String adm_fax) {
		this.adm_fax = adm_fax;
	}
	public String getAdmin_fax_ext() {
		return admin_fax_ext;
	}
	public void setAdmin_fax_ext(String admin_fax_ext) {
		this.admin_fax_ext = admin_fax_ext;
	}
	public String getAdm_phone() {
		return adm_phone;
	}
	public void setAdm_phone(String adm_phone) {
		this.adm_phone = adm_phone;
	}
	public String getAdmin_phone_ext() {
		return admin_phone_ext;
	}
	public void setAdmin_phone_ext(String admin_phone_ext) {
		this.admin_phone_ext = admin_phone_ext;
	}
	public String getTech_email() {
		return tech_email;
	}
	public void setTech_email(String tech_email) {
		this.tech_email = tech_email;
	}
	public String getTech_name() {
		return tech_name;
	}
	public void setTech_name(String tech_name) {
		this.tech_name = tech_name;
	}
	public String getTech_organization() {
		return tech_organization;
	}
	public void setTech_organization(String tech_organization) {
		this.tech_organization = tech_organization;
	}
	public String getTechnicalContact_street1() {
		return technicalContact_street1;
	}
	public void setTechnicalContact_street1(String technicalContact_street1) {
		this.technicalContact_street1 = technicalContact_street1;
	}
	public String getTechnicalContact_street2() {
		return technicalContact_street2;
	}
	public void setTechnicalContact_street2(String technicalContact_street2) {
		this.technicalContact_street2 = technicalContact_street2;
	}
	public String getTechnicalContact_street3() {
		return technicalContact_street3;
	}
	public void setTechnicalContact_street3(String technicalContact_street3) {
		this.technicalContact_street3 = technicalContact_street3;
	}
	public String getTechnicalContact_street4() {
		return technicalContact_street4;
	}
	public void setTechnicalContact_street4(String technicalContact_street4) {
		this.technicalContact_street4 = technicalContact_street4;
	}
	public String getTech_city() {
		return tech_city;
	}
	public void setTech_city(String tech_city) {
		this.tech_city = tech_city;
	}
	public String getTech_state_province() {
		return tech_state_province;
	}
	public void setTech_state_province(String tech_state_province) {
		this.tech_state_province = tech_state_province;
	}
	public String getTech_postal_code() {
		return tech_postal_code;
	}
	public void setTech_postal_code(String tech_postal_code) {
		this.tech_postal_code = tech_postal_code;
	}
	public String getTech_country() {
		return tech_country;
	}
	public void setTech_country(String tech_country) {
		this.tech_country = tech_country;
	}
	public String getTech_fax() {
		return tech_fax;
	}
	public void setTech_fax(String tech_fax) {
		this.tech_fax = tech_fax;
	}
	public String getTech_fax_ext() {
		return tech_fax_ext;
	}
	public void setTech_fax_ext(String tech_fax_ext) {
		this.tech_fax_ext = tech_fax_ext;
	}
	public String getTech_phone() {
		return tech_phone;
	}
	public void setTech_phone(String tech_phone) {
		this.tech_phone = tech_phone;
	}
	public String getTech_phone_ext() {
		return tech_phone_ext;
	}
	public void setTech_phone_ext(String tech_phone_ext) {
		this.tech_phone_ext = tech_phone_ext;
	}
	public String getRegistrar_IANA_id() {
		return registrar_IANA_id;
	}
	public void setRegistrar_IANA_id(String registrar_IANA_id) {
		this.registrar_IANA_id = registrar_IANA_id;
	}
	@Override
	public String toString() {
		return "WhoIsDemo [id=" + id + ", domain=" + domain + ", registrar=" + registrar + ", reg_email=" + reg_email
				+ ", registrar_whois_server=" + registrar_whois_server + ", name_server=" + name_server + ", reg_date="
				+ reg_date + ", updated_date=" + updated_date + ", expir_date=" + expir_date + ", domain_status="
				+ domain_status + ", registrar_abuse_contact_email=" + registrar_abuse_contact_email + ", reg_name="
				+ reg_name + ", registrant_organization=" + registrant_organization + ", registrant_street1="
				+ registrant_street1 + ", registrant_street2=" + registrant_street2 + ", registrant_street3="
				+ registrant_street3 + ", registrant_street4=" + registrant_street4 + ", registrant_city="
				+ registrant_city + ", registrant_state_province=" + registrant_state_province
				+ ", registrant_postal_code=" + registrant_postal_code + ", reg_country=" + reg_country + ", reg_fax="
				+ reg_fax + ", registrant_fax_ext=" + registrant_fax_ext + ", registrar_abuse_contact_phone="
				+ registrar_abuse_contact_phone + ", registrant_phone_ext=" + registrant_phone_ext + ", adm_email="
				+ adm_email + ", adm_name=" + adm_name + ", admin_organization=" + admin_organization
				+ ", administrativeContact_street1=" + administrativeContact_street1
				+ ", administrativeContact_street2=" + administrativeContact_street2
				+ ", administrativeContact_street3=" + administrativeContact_street3
				+ ", administrativeContact_street4=" + administrativeContact_street4 + ", admin_city=" + admin_city
				+ ", admin_state_province=" + admin_state_province + ", admin_postal_code=" + admin_postal_code
				+ ", adm_country=" + adm_country + ", adm_fax=" + adm_fax + ", admin_fax_ext=" + admin_fax_ext
				+ ", adm_phone=" + adm_phone + ", admin_phone_ext=" + admin_phone_ext + ", tech_email=" + tech_email
				+ ", tech_name=" + tech_name + ", tech_organization=" + tech_organization
				+ ", technicalContact_street1=" + technicalContact_street1 + ", technicalContact_street2="
				+ technicalContact_street2 + ", technicalContact_street3=" + technicalContact_street3
				+ ", technicalContact_street4=" + technicalContact_street4 + ", tech_city=" + tech_city
				+ ", tech_state_province=" + tech_state_province + ", tech_postal_code=" + tech_postal_code
				+ ", tech_country=" + tech_country + ", tech_fax=" + tech_fax + ", tech_fax_ext=" + tech_fax_ext
				+ ", tech_phone=" + tech_phone + ", tech_phone_ext=" + tech_phone_ext + ", registrar_IANA_id="
				+ registrar_IANA_id + "]";
	}
	
	
	
	
	
	
	
	
	
}
