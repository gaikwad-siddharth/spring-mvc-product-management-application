package in.siddharth.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class Product {
	
	@Id
	@GeneratedValue
	private Integer pid;
	
	@NotBlank(message="Name is mandatory")
	@Size(min=3 , max=15, message= "name should be 3 to 15 charater	")
	private String name;
	
	@NotNull(message="Price is mandatory")
	@Positive(message="Price should be positive")
	private Double price;
	
	@NotNull(message="Quantity is mandatory")
	private Integer qty;

}
