package community.like.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BoardLikeDto {
    
    public static class response{ // 좋아요 누른 상태 반환
        private boolean bLikeStatus;
    }
}
