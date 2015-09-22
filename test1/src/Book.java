public class Book {
        private String author;
		private String name;
        private int year;
        
        Book(String author, String name, int year){
            this.author = author;
            this.name = name;
            this.year = year;
        }
        public String getInfo() {
			return author+" "+name+" "+year;
		}
        //
}
