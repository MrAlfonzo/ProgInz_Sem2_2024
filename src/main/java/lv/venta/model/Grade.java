package lv.venta.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
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
@Table(name = "GradeTable")
@Entity
public class Grade {

	@Setter(value = AccessLevel.NONE)
	@Column(name = "Idg")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // autoincrement
	private int idg;
	
	@Column(name = "Grvalue")
	@Min(1)
	@Max(10)
	private int grvalue;
	
	@ManyToOne
	@JoinColumn(name = "Idc")
	private Course course;
	
	
}
