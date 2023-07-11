package ShopService;

public class ShopService {

	private static ShopService singleton = new ShopService();
	
	//싱글톤
	private ShopService() {		
	}
	
	static ShopService getInstance() {
		return singleton;
	}
}
