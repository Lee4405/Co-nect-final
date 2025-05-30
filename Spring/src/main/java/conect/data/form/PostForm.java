package conect.data.form;

import conect.data.entity.PostEntity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class PostForm {
    private int post_pk_num; //게시글 번호 [PK, INT, INCREMENT]
    private int post_kind; //게시글 유형 [INT]
    private String post_targetnum; //게시글 대상 사원번호 [VARCHAR] => String으로 작성 이후 데이터사용은 String tokenizer 사용
    private String post_name; //게시글 제목 [VARCHAR]
    private LocalDateTime post_regdate = LocalDateTime.now(); //게시글 등록일 [DATETIME]
    private String post_import; //게시글 중요도 [VARCHAR] (낮음,보통,높음,매우 높음)
    private String post_content; //게시글 내용 [TEXT]
    private String post_tag; //게시글 태그 [VARCHAR]
    private int post_depth; //게시글 깊이 [INT] (기본값 0, 답글 설정시 사용)
    private int post_view; //게시글 조회수 [INT]
    private int post_fk_comp_num; //게시글 회사 고유번호 [FK, INT]
    private int post_fk_user_num; //게시글 작성자 사번 [FK, INT]
    private int post_temp;//게시글 저장 상태
    
    public static PostEntity toEntity(PostForm form) {
        //외래키의 정보만 가지고 가서 findById로 찾아야함
        PostEntity entity = new PostEntity();
        entity.setPostPkNum(form.getPost_pk_num());
        entity.setPostKind(form.getPost_kind());
        entity.setPostTargetnum(form.getPost_targetnum());
        entity.setPostName(form.getPost_name());
        entity.setPostRegdate(form.getPost_regdate());
        entity.setPostImport(form.getPost_import());
        entity.setPostContent(form.getPost_content());
        entity.setPostTag(form.getPost_tag());
        entity.setPostDepth(form.getPost_depth());
        entity.setPostView(form.getPost_view());
        entity.setPostTemp(form.getPost_temp());
        return entity;
    }
}