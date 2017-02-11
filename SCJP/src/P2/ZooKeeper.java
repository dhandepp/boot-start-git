package P2;

class Mammal {
 String name = "furry ";
 String makeNoise() { return "generic noise"; }
 }
 class Zebra extends Mammal {
	 String name = "stripes ";
 String makeNoise() { 
	/* char a = 0x892; // hexadecimal literal
	 char b = 982; // int literal
	 char c = (char)70000; // The cast is required; 70000 is
	 // out of char range
	 char d = (char) -98;
	System.out.println(a+" "+b+" "+c+" "+d); */
	
	/*byte a = 3; // No problem, 3 fits in a byte
	byte b = 8; // No problem, 8 fits in a byte
	float f = 32.3;
	byte c = b + c; // Should be no problem, sum of the two bytes
	// fits in a byte
*/	
/*	byte b = 3;
	b += 7; // No problem - adds 7 to b (result is 10)
*/	
	byte b = 3;
	b =  (byte) (b + 7);
	
	
	 return "bray"; }
 }
 public class ZooKeeper {
 public static void main(String[] args) { new ZooKeeper().go(); }
 void go() {
 Mammal m = new Zebra();
 System.out.println(m.name + m.makeNoise());
 }
 }