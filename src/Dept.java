import lombok.Data;

@Data
public class Dept {
	
	private Integer id;
	
	public static void main(String[] args) {
		Dept d = new Dept();
		d.setId(1);
		System.out.println(d.getId());
	}
}
