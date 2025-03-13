package conect.data.dto;

import conect.data.entity.FavoritesEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FavoritesDto {
    private int favor_id;
    private int favor_fk_user_num;
    private Integer favor_fk_post_num;
    private Integer favor_fk_proj_num;

    public static FavoritesDto fromEntity(FavoritesEntity entity) {
        FavoritesDto dto = new FavoritesDto();
        dto.setFavor_id(entity.getFavorId());
        dto.setFavor_fk_user_num(entity.getUserEntity().getUserPkNum());
        if(entity.getPostEntity() != null) {
        	dto.setFavor_fk_post_num(entity.getPostEntity().getPostPkNum());
        }
        if(entity.getProjectEntity() != null) {
        	dto.setFavor_fk_proj_num(entity.getProjectEntity().getProjPkNum());
        }
        return dto;
    }
}