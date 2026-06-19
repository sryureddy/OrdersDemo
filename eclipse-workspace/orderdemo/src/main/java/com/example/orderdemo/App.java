package com.example.orderdemo;







import java.util.List;



import java.util.Scanner;



import java.time.LocalDate;







public class App {



    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);



        OrderDAO dao = new OrderDAO();



        while (true) {



            System.out.println("\n===== Orders Menu =====");







            System.out.println("1. Insert Orders");







            System.out.println("2. Find Orders By ID");







            System.out.println("3. Display All Orders");







            System.out.println("4. Update Orders");







            System.out.println("5. Delete Order");







            System.out.println("6. Exit");







            int choice = sc.nextInt();



            switch (choice) {



            case 1:



            	Order e = new Order();



                System.out.print("Enter ID: ");



                e.setId(sc.nextInt());



                sc.nextLine();



                System.out.print("Enter Name: ");



                e.setName(sc.nextLine());



                System.out.print("Enter Food: ");



                e.setFood(sc.nextLine());



                System.out.print("Enter Quantity: ");



                e.setQuantity(sc.nextInt());

                

                System.out.print("Enter total amount: ");

                e.setAmount(sc.nextDouble());



                System.out.print("Enter Date (yyyy-mm-dd): ");



                e.setDate(LocalDate.parse(sc.next()));

                

                sc.nextLine();

                

                System.out.println("Enter Order Status: ");

                e.setOstatus(sc.nextLine());



                dao.save(e);



                System.out.println("Employee Saved");



                break;



            case 2:



                System.out.print("Enter ID: ");



                int id = sc.nextInt();



                Order employee = dao.findById(id);



                if (employee != null) {



                    System.out.println(employee.getId());



                    System.out.println(employee.getName());



                    System.out.println(employee.getFood());



                    System.out.println(employee.getQuantity());

                    

                    System.out.println(employee.getAmount());



                    System.out.println(employee.getDate());

                    

                    System.out.println(employee.getOstatus());



                } else {



                    System.out.println("Order Not Found");



                }



                break;



            case 3:



                List<Order> employees = dao.findAll();



                for (Order emp : employees) {



                    System.out.println(



                    		emp.getId() + " "



                            + emp.getName() + " "



                            + emp.getFood() + " "



                            + emp.getQuantity()  + " "

                            

                            +emp.getAmount() + " "



                            + emp.getDate()+ " "

                            

                    		+emp.getOstatus());



                }



                break;



            case 4:



                System.out.print("Enter Employee ID: ");



                int updateId = sc.nextInt();



                Order up = dao.findById(updateId);



                if (up != null) {



                    sc.nextLine();



                    System.out.print("New Name: ");



                    up.setName(sc.nextLine());



                    System.out.print("New Food: ");



                    up.setFood(sc.nextLine());



                    System.out.print("New Quantity: ");



                    up.setQuantity(sc.nextInt());

                    

                    System.out.print("New Total Amount: ");

                    

                    up.setAmount(sc.nextDouble());



                    System.out.print("New Date: ");



                    up.setDate(LocalDate.parse(sc.next()));

                    

                    sc.nextLine();

                    System.out.print("New Status: ");



                    up.setOstatus(sc.nextLine());

                    



                    dao.update(up);



                    System.out.println("Updated");



                }



                break;



            case 5:



                System.out.print("Enter Order ID: ");



                int deleteId = sc.nextInt();



                dao.delete(deleteId);



                System.out.println("Deleted");



                break;



            case 6:



                System.out.println("Thank You");



                sc.close();



                System.exit(0);



            }



        }



    }



}