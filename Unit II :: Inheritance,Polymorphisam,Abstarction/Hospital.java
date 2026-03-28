// 16.	A hospital manages different types of staff. 
// Question: 
// Create a base class Staff with method work(). 
// Create subclasses: 
// Doctor 
// 	Nurse 
// 	Receptionist 
// Override work() to display different responsibilities. 

class Staff{
    public void work(){
        System.out.println("Staff memeber have responsibilitie in the hospital");

    }
}
class Doctor extends Staff{
    public void work(){
        System.out.println("Doctor doagnoses the patioenmt and prescribe the tratement");
    }

}
class Nurse extends Staff{
    public void work(){
        System.out.println("Nuse provide patient care  and administrat modification");
    }

}
class Receptionist extends Staff{
    public void work(){
        System.out.println("Receptionist mange appointments and greet patients"); 
    }

}
class Hospital{
    public static void main(String args[]){
        Doctor d = new Doctor();
        Nurse n = new Nurse();
        Receptionist r = new Receptionist();
        d.work();
        n.work();
        r.work();
    }
}