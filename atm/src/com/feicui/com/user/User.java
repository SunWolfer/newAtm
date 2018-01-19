package com.feicui.com.user;

import java.io.Serializable;

public class User  implements Serializable{

	private static final long serialVersionUID = -7381348820433071382L;
	private String account;//����
	private String name;//����
	private double balance;//���
	private String password;//����
	private String gender;//�Ա�
	private String id;//���֤��
	private String education;//ѧ��
	private String address;//��ϵ��ַ
	private String drawdate;//ȡ��ʱ��
	private String operationdate;//���ʱ��
	private String transferdate;//ת��ʱ��
	private double draw;//ȡ����
	private double opera;//�����
	private double othermoney;//ת�˽��
	private StringBuffer sb = new StringBuffer();//������Ϣ
	
	public User(String account,String name,double balance,String password,String gender,//�û���Ϣ
			String id,String education,String address) {
		this.account = account;
		this.name = name;
		this.balance = balance;
		this.password = password;
		this.gender = gender;
		this.id = id;
		this.education = education;
		this.address = address;
	}
	
	public User(String account,String password,String id) {//�жϵ�¼ʱʹ��
		this.account = account;
		this.password = password;
		this.id = id;		
	}
	public String getSb(){
		return sb.toString();
	}
	public void setDraw(double draw){//ȡ����
		this.draw = draw;
	}
	public double getDraw(){
		return draw;
	}
	
	public void setOpera(double opera){//�����
		this.opera = opera;
	}
	public double getOpera(){
		return opera;
	}
	
	public void setOthermoney(double othermoney){//ת�˽��
		this.othermoney = othermoney;
	}
	public double getOthermoney(){
		return othermoney;
	}
	
	public void setDrawdate(String drawdate){//ȡ������
		this.drawdate=drawdate;
	}
	public String getDrawdate(){
		return drawdate;
	}
	
	public void setOperationdate(String operationdate){//�������
		this.operationdate=operationdate;
	}
	public String getOperationdate(){
		return operationdate;
	}

	public void setTransferdate(String transferdate){//ת��ʱ��
		this.transferdate = transferdate;
	}
	
	public String getTransferdate(){
		return transferdate;
	}
	
	public void setAccount(String account) {
		this.account = account;
	}
	public String  getAccount() {//����

		return account;
	}
	public void setBalance(double balance){//���
		this.balance = balance;
	}
	public double getBalance() {

		return balance;
	}
	public void setName(String name) {//�û�����
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPassword(String password){//����
		this.password = password;
	}

	public String getPassword() {

		return password;
	}
	public void setGender(String gender) {//�Ա�
		this.gender = gender;
	}
	public String getGender() {
		return gender;
	}
	public void setId(String id) {//���֤
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setEducation(String education) {//ѧ��
		this.education = education;
	}
	public String getEducation() {
		return education;
	}
	public void setAddress(String address) {//��ϵ��ַ
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void record(String date,String record,double amount){
		sb.append(date);
		sb.append(" ");
		sb.append(record);
		sb.append(" ");
		sb.append(amount);
		sb.append("\n");//�ַ���ƴ��
	}
	@Override
	public boolean equals(Object arg0) {//������˻��Ƿ����
		// TODO Auto-generated method stub
		return account.equals(((User)arg0).account);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.join(",", "����"+account,"\n"+"����"+name,"\n"+"���"+""+balance,"\n"+"����"+password,"\n"+"�Ա�(1�����У�2����Ů)"+gender,//�û���Ϣ
			"\n"+"���֤"+id,"\n"+"ѧ��(1����  Сѧ  2���� ��ѧ  3�����ѧ 4��������):"+education,"\n"+"��ַ:"+address);
	}
}
