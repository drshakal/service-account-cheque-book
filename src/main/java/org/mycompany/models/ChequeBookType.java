package org.mycompany.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cheque_book")
public class ChequeBookType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int id;
	
	@Column(name="cheque_book_name")
    protected String chequeBookName;
	@Column(name="cheque_book_address1")
    protected String chequeBookAddress1;
	@Column(name="cheque_book_address2")
	protected String chequeBookAddress2;
	@Column(name="cheque_book_address3")
	protected String chequeBookAddress3;
	@Column(name="cheque_book_address4")
    protected String chequeBookAddress4;
	@Column(name="cheque_book_post")
    protected String chequeBookPost;
	@Column(name="cheque_book_type")
    protected String chequeBookType;
	public String getChequeBookName() {
		return chequeBookName;
	}
	public void setChequeBookName(String chequeBookName) {
		this.chequeBookName = chequeBookName;
	}
	public String getChequeBookAddress1() {
		return chequeBookAddress1;
	}
	public void setChequeBookAddress1(String chequeBookAddress1) {
		this.chequeBookAddress1 = chequeBookAddress1;
	}
	public String getChequeBookAddress2() {
		return chequeBookAddress2;
	}
	public void setChequeBookAddress2(String chequeBookAddress2) {
		this.chequeBookAddress2 = chequeBookAddress2;
	}
	public String getChequeBookAddress3() {
		return chequeBookAddress3;
	}
	public void setChequeBookAddress3(String chequeBookAddress3) {
		this.chequeBookAddress3 = chequeBookAddress3;
	}
	public String getChequeBookAddress4() {
		return chequeBookAddress4;
	}
	public void setChequeBookAddress4(String chequeBookAddress4) {
		this.chequeBookAddress4 = chequeBookAddress4;
	}
	public String getChequeBookPost() {
		return chequeBookPost;
	}
	public void setChequeBookPost(String chequeBookPost) {
		this.chequeBookPost = chequeBookPost;
	}
	public String getChequeBookType() {
		return chequeBookType;
	}
	public void setChequeBookType(String chequeBookType) {
		this.chequeBookType = chequeBookType;
	}
    
    
}
