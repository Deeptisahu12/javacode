package Staticmember;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class static1 {
    public void driver(){
       SuperCar sc= SuperCar.getInstance();

        /*Account a=new Account();
        a.setAccountNumber(122732432);
        a.setBalance(50000);
        a.setRateOfInterest(5);
        a.setCustomerName("deepti sahu");
        System.out.println("AccountNumber="+a.getAccountNumber());
        System.out.println("balance="+a.getBalance());
        System.out.println("customerName="+a.getCustomerName());
        System.out.println("SimpleInterest="+a.getSimpleInterest(5));*///class Account

    }
}
class Box{
    private int length,breadth,height;
    private  static int BoxCount;
    public void setDimension(int l,int b,int h){
        length=l;
        breadth=b;
        height=h;
    }
    public void showDimension(){
        System.out.println("length="+length);
        System.out.println("breadth="+breadth);
        System.out.println("height="+height);
    }
    public static void showBoxCount(){
        System.out.println("Box Count="+BoxCount);
    }
}
class Batch{
    private int BatchCode;
    private String CourseName;
    private LocalDateTime startDate;
    private int studentCount;
    private LocalDateTime time;
    private String days;
    private static int totalBatches;

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public int getBatchCode() {
        return BatchCode;
    }

    public void setBatchCode(int batchCode) {
        BatchCode = batchCode;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public static int getTotalBatches() {
        return totalBatches;
    }

    public static void setTotalBatches(int totalBatches) {
        Batch.totalBatches = totalBatches;
    }
}
class Video{
    private int videoId;
    private String title;
    private int like;
    private static int TotalVideo;

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public static int getTotalVideo() {
        return TotalVideo;
    }

    public static void setTotalVideo(int totalVideo) {
        TotalVideo = totalVideo;
    }
}
class SuperCar{
    private String OwnerName;
    private double price;
    private String colour;
    private String brand;
    private SuperCar(){

    }
    private static SuperCar ref;
    public static SuperCar getInstance(){
        if(ref==null) {
            ref=new SuperCar();
            return ref;
        }
        return null;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
class Account{
    private int accountNumber;
    private String customerName;
    private double balance;
    private static float rateOfInterest;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void setRateOfInterest(float rateOfInterest) {
        Account.rateOfInterest = rateOfInterest;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public static float getRateOfInterest() {
        return rateOfInterest;
    }
    public double getSimpleInterest(int time){
        return balance*rateOfInterest*time/100.0;
    }
}
