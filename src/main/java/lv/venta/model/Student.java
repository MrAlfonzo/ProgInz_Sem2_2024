package lv.venta.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
//@AllArgsConstructor
@Table (name = "StudentTable")
@Entity
public class Student {
	@Setter(value = AccessLevel.NONE)
	@Column(name = "Ids")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //autoincrement
	private int ids;
	
	@NotNull
	@Size(min = 2, max = 50)
	@Pattern(regexp = "[A-ZĒŪĪĻĶĢŠĀŽČŅ]{1}[a-zēūīļķģšāžčņ ]+", message = "Only letters and space are allowed")
	@Column(name = "Name")
	private String name;
	
	@NotNull
	@Size(min = 2, max = 50)
	@Pattern(regexp = "[A-ZĒŪĪĻĶĢŠĀŽČŅ]{1}[a-zēūīļķģšāžčņ ]+", message = "Only letters and space are allowed")
	@Column(name = "Surname")
	private String surname;
	
	public Student(String name, String surname) {
		setName(name);
		setSurname(surname);
	}
	
}
