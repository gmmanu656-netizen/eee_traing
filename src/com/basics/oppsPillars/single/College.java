package com.basics.oppsPillars.single;

public class College {
    static String name = "SNPSU";
    String address;
    int pincode;
    public College(String address, int pincode) {
        this.address = address;
        this.pincode = pincode;
    }
  }
  class Department extends College{
    String block;
    int lecturerCount;
    Department(String address, int pincode, String block, int lecturerCount){
        super(address, pincode);
        this.block = block;
        this.lecturerCount = lecturerCount;
    }
    void departmentDetails(){
        System.out.println(block + " " + lecturerCount + " " + address + " " + pincode + " " + College.name);
    }

      static void main() {
          Department department = new Department("Bangalore", 56007, "A", 15);
          department.departmentDetails();
      }
}
/*
points to remember
✅super.something -> variable from parent class
☑️super() -> constructor of the parent class
❌ Don't use super. for constructor
these are the important for interviews and vives
 */
