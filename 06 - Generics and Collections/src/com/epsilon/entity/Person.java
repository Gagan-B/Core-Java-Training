package com.epsilon.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data //adds all the below commented part and canEqual code too
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode   //adds the hash code generator and equality checking functions
public class Person implements Comparable<Person>{
	private String name;
	private int age;
	private double height;
	//defines the natural ordering of two objects of this class
	@Override
	public int compareTo(Person that) {
		//return 0;    prints only 1 line of tree set
		//return this.hashCode() - that.hashCode(); prints all lines
		int c = this.name.compareTo(that.name); //this compareTo is of the string
		if(c==0) {
			c=this.age - that.age;  //age check
			if(c==0) {
				c=Double.compare(this.height, that.height);  ///height check
				return c;
			}
		}
		return c;  //if same, then only 1 entry will be there
	}

}
