package me.shackox.user.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.shackox.user.entity.User;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private User user;
    private Department department;
}
