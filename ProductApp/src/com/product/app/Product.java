package com.product.app;

public class Product {
			int pid;
			String pname;
			double price;
			public Product(int pid, String pname, double price) {
				super();
				this.pid = pid;
				this.pname = pname;
				this.price = price;
			}
			@Override
			public String toString() {
				return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
			}
			public int getPid() {
				return pid;
			}
			public void setPid(int pid) {
				this.pid = pid;
			}
			public String getPname() {
				return pname;
			}
			public void setPname(String pname) {
				this.pname = pname;
			}
			public double getPrice() {
				return price;
			}
			public void setPrice(double price) {
				this.price = price;
			}
			public Product() {
				
				// TODO Auto-generated constructor stub
			}
			
}
