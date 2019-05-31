package recap;

public class EbayTest {
	public static void main(String[] args) {
		
		Ebay.navigate(DataTest.url);
		
		Ebay.login(DataTest.userID, DataTest.passwd);
		
		Ebay.search(DataTest.searchItem);
	}
}
