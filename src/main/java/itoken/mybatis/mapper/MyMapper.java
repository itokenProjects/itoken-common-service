package itoken.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 创建自定义通用mapper接口
 * 特别注意：该接口不能被扫描到，否则会报错（不能被spring扫描到）（不能和controller和service创建到同一目录下）
 * @param <T>
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
