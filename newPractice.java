
import java.util.*;
// class Main{
// public static void main(String[] args){
// int num = 12;
// String name = " Tarun ";
// System.out.println(name.length());

// System.out.println(name.toUpperCase());
// System.out.println(name.toLowerCase());
// System.out.println(name.trim());

// Scanner sc = new Scanner(System.in);
// while(true){
// System.out.println("enter your website");

// String website = sc.next();
// if(website.endsWith(".org")){
// System.out.println("this is an organizational website");
// }else if(website.endsWith(".com")){
// System.out.println("this is International website");

// }else if(website.endsWith(".in")){
// System.out.println("this is an Indiam website");
// }
// else{
// System.out.println("this is out of database");
// }
// }

// int[] marks = {1,2,3,4,5};
// System.out.println("the length is : " + marks.length);

// System.out.println(marks[0]);
// System.out.println(marks[1]);
// System.out.println(marks[2]);
// System.out.println(marks[3]);
// System.out.println(marks[4]);

// create an java program t o add two matrix of size 2 X 3

// find the max in array

// int arr[] = {1,2,4,3,8,13,4};
// for(int element : arr){
// System.out.print(element + " ");
// }
// System.out.println();

// int max = 0;
// for(int element : arr){
// if(element > max){
// max = element;
// }
// }

// System.out.println("the max is : " + max);

// for(int i=0; i<arr.length; i++){
// if(arr[i] > max){
// max = arr[i];
// }
// }

// System.out.println("the i sum is : " + ma

// }
// }

// class Main{

// public static int mySum(int a, int b){
// int c = a+b;
// return c;
// }

// public static int mySum(int a, int b){
// return;
// }

// public static void myMul(int a, int b){

// }

// public static void myMul(int c, int d){
// int e = c*d;
// System.out.println("The mul is : " + e);
// }

// public static void main(String[] args){
// int a = 12;
// int b = 12;
// int result = mySum(a,b);
// System.out.println("the result is : " + result);

// int c = 5;
// int d = 5;
// myMul(c,d);

// }
// }

// class Main{

// static class Calculator{
// int mySum(int a, int b){
// return a+b;
// }

// }

// public static void main(String[] args){
// Calculator obj = new Calculator();
// System.out.println(obj.mySum(2,4));

// }
// }

// Method Overloading
// class Main{
// static void sayHello(){
// System.out.println("saying hello");
// }

// static void sayHello(String name){
// System.out.println("saying Hello to " + name);
// }

// static void sayHello(String name, int num){
// System.out.println("saying Hello to " + name + " and times are " + num);
// }

// public static void main(String[] args){
// sayHello();
// sayHello("Tarun");
// sayHello("Namdev", 10);
// }
// }

// class Main{

// static int factorialFunc(int n){
// if(n==0 || n==1){
// return 1;
// }else{
// return n * factorialFunc(n-1);
// }
// }

// public static void main(String[] args){
// int n = 5;
// System.out.println("the factorial of " + n + " is " + factorialFunc(n));
// }
// }

// class Main{

// static int recursiveSum(int n){
// //base case
// if(n==1){
// return 1;
// }else{
// return n + recursiveSum(n-1);
// }
// }

// public static void main(String[] args){
// int n = 5;
// System.out.println("the sum of " + n + " numbers are : " + recursiveSum(n));
// }
// }

// class Main{

// static void printTable(int num, int start, int end){
// System.out.println(num + " X " + i + " = " + (n*i));
// printTable(num, i+1);
// }

// public static void main(String[] args){
// int num = 5;
// printTable(num, 1, 10);
// }
// }

// class Main{

// static void printTable(int num){
// for(int i=1; i<=10; i++){
// System.out.println(num + " X " + i + " = " + num*i);
// }
// }

// public static void main(String[] args){
// int num = 5;
// for(int i=1; i<=10; i++){
// System.out.println(num + " X " + i + " = " + num*i);
// }

// printTable(7);
// }
// }

// creating our own java class
// class Main{

// static class Employee{
// int id;
// String name;
// public void printDetails(){
// System.out.println("my name is : " + name);
// System.out.println("my id is : " + id);

// }
// }

// public static void main(String[] args){
// System.out.println("This is our Custom class");
// Employee harry = new Employee();
// harry.id = 12;
// harry.name = "codewithharry";

// }
// }

// class Main{

// static class Employee{
// int salary;
// int name;

// public int getSalary(){
// return salary;
// }

// public String getName(){
// return name;
// }

// public void setName(String n){
// name = n;
// }
// }

// public static void main(String[] args){

// Employee harry = new Employee();
// harry.setName("codewithharry");
// harr.salary = 23232323;
// System.out.println(harry.getSalary());
// System.out.println(harry.getName());

// }
// }

// class Main{

// static class cellPhone{
// public void ring(){
// System.out.println("ringing");
// }

// public void speak(){
// System.out.println("speaking");
// }

// public void callFriend(){
// System.out.println("calling mukul.....");
// }
// }

// public static void main(String[] args){
// cellPhone c = new cellPhone();
// c.ring();
// c.speak();
// c.callFriend();

// }
// }

// class Main{

// static class Square{
// int side;

// public int area(){
// return side * side;
// }

// public int parimeter(){
// return 4* side;
// }

// }

// public static void main(String[] args){
// Square sq = new Square();
// sq.side = 2;
// int result1 = sq.area();

// System.out.println(sq.parimeter());
// System.out.println(result1);
// }
// }

// class Main{
// static class Tommy{
// public void fire(){
// System.out.println("Firing on the Enemy");
// }
// public void hit(){
// System.out.println("Hitting on the Enemy");
// }
// public void run(){
// System.out.println("Player is Running......");
// }
// }

// public static void main(String[] args){

// Tommy p1 = new Tommy();
// p1.fire();
// p1.hit();
// p1.run();

// }
// }
