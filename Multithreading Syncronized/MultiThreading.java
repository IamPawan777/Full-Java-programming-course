/*.....every task write in run method only..........
.....call only start() method...if we want to achieve multithreading....
......if we call to run() method program behave like single thread.........
 */



// //..every java program have single default thread name-"main", priority:"5"

// public class MultiThreading {
//     public static void main(String[] args) {
//         String t = Thread.currentThread().getName();
//         int i = Thread.currentThread().getPriority();

//         System.out.println("Default thread: "+t+", and priority is: "+i);
//     }
// }





// //..Can change the name and priority of defalut thread......

// public class MultiThreading {
//     public static void main(String[] args) {
//         Thread th = Thread.currentThread();
//         th.setName("start");
//         String t = Thread.currentThread().getName();
//         System.out.println("Thread name: "+t);

//         th.setPriority(2);
//         int i = Thread.currentThread().getPriority();
//         System.out.println("Priority is: "+i);
//     }
// }






// //.....Thread class extends......

// import java.lang.Thread;		//can skip this line bcz impicitly import java.lang package 

// class Demo extends Thread {
// 	@Override				//use- to override run() method which in Thread class
//     public void run() {
//         for (int i = 0; i < 3; i++) {
//             System.out.println("This is run method,......");
//         }
//     }
// }

// class MultiThreading {
//     public static void main(String[] args) {
//         Demo obj = new Demo();
//         obj.start();
//         obj.run();			//start() method not start again i.e. rannable state m nhi jayega (start -> run)
        
//     }
// }






// //...multiple thread..........

// import java.util.Scanner;

// class Demo extends Thread {
//     public void run() {
//         System.out.println("Demo class");
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter first number: ");
//         int a = sc.nextInt();
//         System.out.println("Enter second number: ");
//         int b = sc.nextInt(); 
//         System.out.println("Sum is: "+(a+b));
//         System.out.println("******************");
//     }
// }

// class Demo2 extends Thread {
//     public void run() {
//         System.out.println("Demo2 class");
//         try {
//             for (int i = 1; i <= 3; i++) {
//             System.out.println("for loop.."+i);
//             Thread.sleep(3000);
//         }
//         } 
//         catch (Exception e) {
//             System.out.println(e);
//         }
        
//         System.out.println("after sleep.");
//         System.out.println("---------------");
//     }
// }

// class MultiThreading {
//     public static void main(String[] args) {
//         System.out.println("main thread..");
//         Demo obj = new Demo();                      //..now thread created....
//         Demo2 obj2 = new Demo2();
//         obj.start();
//         obj2.start();
//     }
// }






// //...runnable interface. implements.........

// import java.util.Scanner;

// class Demo implements Runnable{
//     public void run() {
//         System.out.println("Demo class");
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number: ");
//         int a = sc.nextInt();
//     }
// }

// class Demo2 implements Runnable {
//     public void run() {
//         System.out.println("Demo2 class");
//         for (int i = 1; i <= 3; i++)
//             System.out.println("for loop.."+i);
//     }
// }

// class MultiThreading {
//     public static void main(String[] args) {
//         System.out.println("main thread..");
//         Demo obj = new Demo();                      //..no thread created....
//         Demo2 obj2 = new Demo2();
        
//         Thread t1 = new Thread(obj);                //..now here thread created.....
//         Thread t2 = new Thread(obj2);
//         t1.start();
//         t2.start();
//     }
// }









// //...single run() method but multiple threads and start..........

// import java.util.Scanner;

// class Demo extends Thread{
//     public void run() {
//         String tname = Thread.currentThread().getName();
//         if(tname.equals("sumNum"))          //...*here executes both some time sumName() and some time forLoop() method
//             sumNum();
//         else
//             forLoop();
//     }
//     void sumNum() {
//         System.out.println("sumNum........................");
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number: ");
//         int a = sc.nextInt();
//         System.out.println("Enter 2nd number: ");
//         int b = sc.nextInt();
//         int c = a+b;
//         System.out.println("Sum is:"+c);
//         System.out.println("sumNum........................ended");
//     }

//     void forLoop() {
//        System.out.println("forLoop.....................");
//         try {
//             for (int i = 1; i <= 3; i++) {
//             System.out.println("for loop.."+i);
//             Thread.sleep(3000);
//         }
//         } 
//         catch (Exception e) {
//             System.out.println(e);
//         }
//         System.out.println("forLoop........................ended");
//     }

// }

// class MultiThreading {
//     public static void main(String[] args) {
//         System.out.println("main thread..");
//         Demo obj = new Demo();                     
//         Demo obj2 = new Demo();

//         obj.setName("sumNum");
//         obj2.setName("forLoop");        
       
//         obj.start();
//         obj2.start();
//     }
// }







// // //...join method.....after completing first thread second thread execute..........

// import java.util.Scanner;

// class Demo extends Thread{
//     public void run() {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter 1st number: ");
//         int a = sc.nextInt();
//         System.out.println("Enter 2nd number: ");
//         int b = sc.nextInt();
//         System.out.println("sum is: "+(a+b));
//     }
// }

// class Demo2 extends Thread {
//     public void run() {
//         try {
//             for (int i = 1; i <= 3; i++) {
//                 System.out.println("for loop.."+i);
//                 Thread.sleep(2000);
//             }
//         } catch (Exception e) {
//             System.out.println("catch block");
//         }       
//     }
// }

// class MultiThreading {
//     public static void main(String[] args) {
//         System.out.println("main thread..");
//         Demo obj = new Demo();                      //..no thread created....
//         Demo2 obj2 = new Demo2();
        
//         obj.start();
//         try {
//             obj.join();                         //after completing obj thread
//         } 
//         catch (Exception e) {
//             System.out.println(e);
//         }
//         obj2.start();
//     }
// }







///.....Syncronized keyword..............

class MyThread implements Runnable {
    synchronized public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+ "Online booking.........");                //..booking always together
            Thread.sleep(2000);        
        // synchronized(this) {                                                                                 //..single car allotment one by one...
            System.out.println(Thread.currentThread().getName()+" start the Car.........");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" Got the car and drive.........");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" Come back and pack again.........");
            Thread.sleep(2000);
        // }            
        } catch (Exception e) {
            System.out.println(e);    
        }
    }
}

class MultiThreading {
    public static void main(String[] args) {
        MyThread obj = new MyThread();
        
        Thread t1 = new Thread(obj);                 //....thread 1.......
        Thread t2 = new Thread(obj);                 //....thread 2......
        Thread t3 = new Thread(obj);                  //....thread 3.......

        t1.setName("1-person");
        t2.setName("2-person");
        t3.setName("3-person");

        t1.start();
        t2.start();
        t3.start();
    }
}





//////////////////////***********************************************//////////////////////////////




// //..........4.which scheduler execute first desided by threadscheduler.....
// //*****   different output    ******

// public class MultiThreading extends Thread {
// 	@Override
// 	public void run() {
// 		for(int i=1; i<=5; i++) {
// 			System.out.println("Pawan");
// 		}
// 	}
// 	public static void main(String arg[]) {
// 		MultiThreading obj = new MultiThreading();
// 		obj.start();
// 		for(int i=1; i<=5; i++) {
// 			System.out.println("LLLLLLLL");			
// 		}
// 	}
// }






// //.......7.suspend() & resume() method.......... 

// public class MultiThreading extends Thread {
// 	@Override
// 	public void run() {
// 		for(int i=1; i<=5; i++) {
// 			System.out.println("Pawan");
// 		}
// 	}
// 	public static void main(String arg[]) {
// 		MultiThreading obj = new MultiThreading();
// 		obj.start();
// 		for(int i=1; i<=5; i++) {
// 			System.out.println("LLLLLLLL");
// 			obj.suspend();		//suspend "Pawan" thread
// 			// obj.resume();		//again resume   uncomment the line
// 		}
// 	}
// }






//  //.....8.setPriority() & setname() and getpriority() & getName().....

//  class V extends Thread {

//  }
//  class R extends Thread {
	
//  }
//  class D extends Thread {
	
//  }
//  public class MultiThreading extends Thread {
//  	public static void main(String[] args) {
//  		MultiThreading obj = new MultiThreading();
//  		obj.start();
		
//  		V v = new V();
//  		v.setName("Virat kohli");
//  		R r = new R();
//  		r.setName("Rohit Sharma");
//  		D d = new D();
//  		d.setName("M S Dhoni");
		
//  //		Thread t = Thread.currentThread();
//  		v.setPriority(MIN_PRIORITY);
//  		System.out.println("priority: "+v.getPriority()+" name: "+v.getName());
//  		r.setPriority(v.getPriority()+1);
//  		System.out.println("prioriyt: "+r.getPriority()+" name: "+r.getName());
//  		d.setPriority(r.getPriority()+1);
//  		System.out.println("priority: "+d.getPriority()+" name: "+d.getName());
		
//  	}
//  }





// //.....8.setId()..........

// class V extends Thread {
	
// }
// class R extends Thread {
	
// }
// class D extends Thread {
	
// }
// public class MultiThreading extends Thread {
// 	public static void main(String[] args) {
// 		MultiThreading obj = new MultiThreading();
// 		obj.start();
		
// 		V v = new V();
// 		v.setName("Virat kohli");
// 		R r = new R();
// 		r.setName("Rohit Sharma");
// 		D d = new D();
// 		d.setName("M S Dhoni");
		
// 		System.out.println(v.getId()+" name: "+v.getName());
// 		System.out.println(r.getId()+" name: "+r.getName());
// 		System.out.println(d.getId()+" name: "+d.getName());
		
// 	}
// }






// //.............10.obj.interrupt()....

// public class MultiThrea extends Thread {
// 	@Override
// 	public void run() {
// 		for(int i=0; i<5; i++) {
// 			try {
// 				Thread.sleep(2000);
// 				System.out.println("pawan");
// 			} catch (InterruptedException e) {
// 				System.out.println("Interrupt occurs. \n"+e);
// 			}
// 		}
// 	}
// 	public static void main(String[] args) {
// 		MultiThrea obj = new MultiThrea();
// 		obj.start();
// 		for(int i=0; i<5; i++) {
// 			System.out.println("bisht");
// 			// obj.interrupt();
// 		}
// 	}
// }






// //.............9.obj.join()....

// public class MultiThrea extends Thread {
// 	@Override
// 	public void run() {
// 		for(int i=0; i<5; i++) {
// 			try {
// 				Thread.sleep(2000);
// 				System.out.println("pawan");
// 			} catch (InterruptedException e) {
// 				System.out.println("Interrupt occurs...");
// 			}
// 		}
// 	}
// 	public static void main(String[] args) throws InterruptedException{
// 		MultiThrea obj = new MultiThrea();
// 		obj.start();
// 		for(int i=0; i<5; i++) {
// 			System.out.println("bisht");
// //			obj.interrupt();
// 		}
// 		obj.join();
// 	}
// }






// //...........10.check theard or not............

// public class MultiThreading extends Thread{
// 	public void run() {
// 		System.out.println("\n");
// 		for(int i=0; i<5; i++) {
// 			System.out.println("hiiiiiiiiiiiiiiiiii");
// 		}
// 	}
// 	public static void main(String[] args) {
// 		MultiThreading obj = new MultiThreading();
// 		obj.start();
// 		System.out.println(obj.isDaemon());				//return privious thread
// 		System.out.println(obj.isAlive());      		//return current thread
// 		System.out.println(obj.isInterrupted());        //return if two or more thread interrupt to each other
// 	}
// }





// //..........Synchronization............

// class Demo extends Thread{
// 	public synchronized void disp(String name) {
// 		for(int i = 0; i < 3; i++) {
// 			System.out.println("hello");
// 			try {
// 				Thread.sleep(1500);
// 			} 
// 			catch (InterruptedException e) {
// 				e.printStackTrace();
// 			}
// 			System.out.println(name);
// 		}
// 	}
// }

// class MultiThrea extends Thread{
// 	Demo ob;
// 	String name;
	
// 	MultiThrea(Demo d, String name){
// 		this.ob = d;
// 		this.name = name;
// 	}
// 	public void run() {
// 		ob.disp(name);
// 	}
// 	public static void main(String[] args) {
// 		Demo obx = new Demo();
// 		MultiThrea obj1 = new MultiThrea(obx, "aaaa");
// 		MultiThrea obj2 = new MultiThrea(obx, "bbbb");
// 		MultiThrea obj3 = new MultiThrea(obx, "cccc");
		
// 		obj1.start();
// 		obj2.start();
// 		obj3.start();
// 	}
// }






