package objectslo;

public class object1 {
    public void driver(){
        Book b=new Book();
        b.setBookId(1);
        b.setAuthor("ramanujam");
        b.setPrice(300);
        b.setTitle("math");
        System.out.println("BookId="+b.getBookId());
        System.out.println("Author="+b.getAuthor());
        System.out.println("price="+b.getPrice());
        System.out.println("Title="+b.getTitle());

        /*Circle c=new Circle();
        c.setRadius(5);
        System.out.println("area="+c.getArea());
        System.out.println("Circumference="+c.getCircumference());*///class circle

        /*Distance d1=new Distance();
        Distance d2=new Distance();
        Distance d3;
        d1.setDistance(3,40,10);
        d2.setDistance(2,150,20);
        d3=d1.addDistance(d2);
        d3.displayDistance();*///class distance

        /*Course c=new Course();
        c.setCourseId(1);
        c.setCourseName("math");
        c.setDuration("3 hrs");
        c.setFee(500);
        System.out.println("courseId="+c.getCourseId());
        System.out.println("courseName="+c.getCourseName());
        System.out.println("Duration="+c.getDuration());
        System.out.println("Fee="+c.getFee());*///class Course

        /*Question q=new Question();
        q.setQuestion(1,"what is your name","ram","shyam","radha","deepti",'d');
        System.out.println("qno="+1+" q="+"what is your name"+" a="+"ram"+" b="+"shyam"+" c="+"radha"+" d="+"deepti"+" ans="+'d');*///class Question

        /*Contact c =new Contact();
        c.setId(12);
        c.setFirstName("ram");
        c.setLastName("sahu");
        c.setMobile("89239087");
        c.setEmailID("deepti3654@gmail.com");
        System.out.println("Id="+c.getId());
        System.out.println("FirstName="+c.getFirstName());
        System.out.println("lastName="+c.getLastName());
        System.out.println("mobile="+c.getMobile());
        System.out.println("emailId="+c.getEmailID());*///class contact

        /*Employee e= new Employee();
        e.setEmpid(12);
        e.setName("raman");
        e.setSalary(5000);
        System.out.println("Empid="+e.getEmpid());
        System.out.println("Name="+e.getName());
        System.out.println("salary="+e.getSalary());*///class employee

       /* Cuboid c= new Cuboid();
        c.setLength(20);
        c.setBreadth(15);
        c.setHeight(10);
        System.out.println("Length="+c.getLength());
        System.out.println("Breadth="+c.getBreadth());
        System.out.println("Height="+c.getHeight());
        System.out.println("Volume="+c.getVolume());
        System.out.println("SurfaceArea="+c.getSurfaceArea());*///class cuboid

        /*Time t1=new Time();
        t1.setTime(3,42,50);
        t1.showTime();*///class time

       /* Complex c1=new Complex();
        c1.setComplex(10,20);
        c1.printComplex();*///class complex


    }
}
class Book{
    private int BookId;
    private String title;
    private double price;
    private String author;

    public int getBookId() {
        return BookId;
    }

    public void setBookId(int bookId) {
        BookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
class Circle{
    private float radius;
    public void setRadius(float radius){
        this.radius=radius;
    }
    public float getArea(){
        return 3.14f*radius*radius;
    }
    public float getCircumference(){
        return 2*3.14f*radius;
    }
}
class Distance{
    private int km,m,cm;
    public void setDistance(int x,int y,int z){
        km=x;m=y;cm=z;
    }
    public void displayDistance(){
        System.out.println(km+"km" + m+"m" + cm+"cm");
    }
    public Distance addDistance(Distance d){
       Distance temp=new Distance();
       temp.cm=cm+d.cm;
       temp.cm=temp.cm/100+m+d.m;
       temp.cm=temp.cm%100;
       temp.km=temp.m/1000+km+d.km;
       temp.m=temp.m%1000;
       return temp;
    }
}
class Course{
    private int courseId;
    private String CourseName;
    private String Duration;
    private double fee;
    public int getCourseId(){
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        Duration = duration;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}
class Question {
    private int queNo;
    private String que;
    private String optionA, optionB, optionC, optionD;
    private char answer;

    public void setQuestion(int qno, String q, String a, String b, String c, String d, char ans) {
        queNo = qno;
        que = q;
        optionA = a;
        optionB = b;
        optionC = c;
        optionD = d;
        answer = ans;
    }

    public void displayQuestion() {

        System.out.println("queNo+" + que);
        System.out.println("(a)" + optionA);
        System.out.println("(b)" + optionB);
        System.out.println("(c)" + optionC);
        System.out.println("(d)" + optionD);
        System.out.println("Answer:" + answer);

    }
}
class Contact{
    private int id;
    private String firstName,lastName,mobile,emailID;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }
}
class Employee{
    private int empid;
    private String name;
    private float salary;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
class Cuboid{
    private int length,breadth,height;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getVolume(){
        return length*breadth*height;
    }
    public int getSurfaceArea(){
        return 2*(length*breadth+breadth*height+length*height);
    }
}
class Time{
    private int hr,min,sec;
    public void setTime(int h,int m,int s){
        hr=h;
        min=m;
        sec=s;
    }
    public void showTime(){
        System.out.println(hr+":"+min+":"+sec);
    }
}
class Complex{
    private int real,imag;
    public void setComplex(int r,int i){
        real=r;
        imag=i;
    }
    public void printComplex(){
        System.out.println("Real="+real+ "Imag="+imag);
    }
}

