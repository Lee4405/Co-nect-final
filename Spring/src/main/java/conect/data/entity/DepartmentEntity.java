package conect.data.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "department")
public class DepartmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dpart_pk_num; //부서 번호 [PK, INT]
    private String dpart_name; //부서 이름 [VARCHAR]
    private String dpart_mail; //부서 이메일 [VARCHAR]
    private int dpart_fk_dpart_num; //상위 부서 번호

    @OneToMany(mappedBy = "departmentEntity")
    private List<UserEntity> userEntities;

    @OneToMany(mappedBy = "departmentEntity")
    private List<PostEntity> freeEntities;

    @OneToMany(mappedBy = "departmentEntity")
    private List<ProjectEntity> userEntityList;
}
