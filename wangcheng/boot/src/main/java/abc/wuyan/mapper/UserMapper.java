package abc.wuyan.mapper;

import abc.wuyan.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by wangcheng on 2020/8/24.
 */
@Mapper
public interface UserMapper {
     int insert(User user);
}
