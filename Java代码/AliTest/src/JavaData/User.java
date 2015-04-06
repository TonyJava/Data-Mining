package JavaData;
import java.util.*;

class Data{
	private String userId;
	private int brandId;
	private int type;
	private String date;
	
	
	public Data() {}
	public Data(String userId, int brandId, int type, String date) {
		super();
		this.userId = userId;
		this.brandId = brandId;
		this.type = type;
		this.date = date;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int id) {
		this.brandId = id;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
}
class CompareToData implements Comparator{
	private Map<Integer,Integer> day;
	public CompareToData(){
		day = new HashMap<Integer,Integer>();
		day.put(4, 0);
		day.put(5, 0);
		day.put(6, 1);
		day.put(7, 1);
		day.put(8, 2);
	}
	 public int compare(Object obj0, Object obj1) {
		 Data data0 =(Data)obj0;
		 Data data1 =(Data)obj1;
		 
		 String str0[]=data0.getDate().split("��|��");
		 int t1 = (Integer.parseInt(str0[0])-4)*30+day.get(Integer.parseInt(str0[0]))+Integer.parseInt(str0[1]);
		 String str1[]=data1.getDate().split("��|��");
		 int t2 = (Integer.parseInt(str1[0])-4)*30+day.get(Integer.parseInt(str1[0]))+Integer.parseInt(str1[1]);
		 return t1-t2;
	 }
}
class Brand
{
	public int brandId;
	public int	hitCouts;
	public int	buyCouts;
	public int 	records;
	public int	relativeDay;
	public int	continiousCouts;
	public boolean	isCollect;
	public boolean	isAddCat;
	public boolean  isShopped;
	public double	recommandCo;
	public double	score;
	
	public Brand() {
		this.hitCouts	= 0;
		this.buyCouts	= 0;
		this.records	=0;
		this.isCollect	= false;
		this.isAddCat	= false;
		this.isShopped	=	false;
		this.recommandCo	= 0.0;
		this.relativeDay	=15;
		this.score		=0;
		continiousCouts =0;
		
	}
	
	public boolean equals(Object obj){
		Brand brand = (Brand)obj;
		if(this.brandId == brand.brandId){
			return true;
		} 
		else{
			return false;
		}
	}
	
	 public int hashCode(){
		 return new Integer(brandId).hashCode();  
     }
	
}
public class User {

	private String userId;
	private int		records;              	//�û���Ϊ����
	public double buyProbility;				//������� = ������/records
	public double behavRate;           		//�û������  =�û���Ϊ����/������     ���û��Ƽ�����
	public int 		hitCouts;   			//�������û��ĵ����
	public int		buyCouts;				//�����̱�����
	public int		userType;				//�û����ͣ�0-Ƶ�����û���1-�м����û���2-�������û�
	public 	Set<Integer> collections; 		//�����û��ղ��̱�
	public 	Set<Integer> buyCat;			//�ӹ��ﳵ
	public 	Set<Integer> buySet;			//�����û������̱�id
	public 	Set<Brand> 		buyedBrand;			//�����û�������̱�
	public 	HashSet<Brand>		favourBrandSet;	//�û����̱�ϲ��
	public	ArrayList<Brand>	brands;
	public 	Set<Integer>	preBrands;
	public	String 		month;
	public	boolean		isRecommand;        //�Ƿ�Ϊ���û�Ԥ���̱�
	public User() {
		super();
		this.collections	= new HashSet<Integer>();
		this.buySet 		= new HashSet<Integer>();
		this.buyedBrand 	= new HashSet<Brand>();
		this.favourBrandSet = new HashSet<Brand>();
		this.preBrands		= new HashSet<Integer>();
		this.buyCat			= new HashSet<Integer>();
		this.records		= 0;
		this.buyProbility 	= 0.0;
		this.hitCouts 		= 0;
		this.behavRate		=0.0;
		this.isRecommand	= false;   
		this.brands			= new ArrayList<Brand>();
		this.userType		=1;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getRecords() {
		return records;
	}
	public void setRecords(int records) {
		this.records = records;
	}
	
	public boolean equals(Object obj){
		User user = (User)obj;
		if(this.userId.equals(user.getUserId())){
			return true;
		} 
		else{
			return false;
		}
	}
}
