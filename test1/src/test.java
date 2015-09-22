public class test {

	public static void main(String[] args) {
		
			
		Book mas[] = new Book[3];
		mas[0] = new Book("Vasya", "Book1", 1990);
		mas[1] = new Book("Petya", "Book2", 1922);
		mas[2] = new Book("Ivan", "Book3", 1994);
		for (int i=0; i<3; i++)
		System.out.println(""+mas[i].getInfo());
	}

}
