package com.abc.juqeryui;

/**
 * Created by jackl on 2016/7/29.
 */

import com.abc.juqeryui.entity.User;
import com.abc.juqeryui.mapper.MybatisSpringPageInterceptor;
import com.abc.juqeryui.mapper.UserMapper;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Configuration
public class DatabaseConfiguration {
   /* private static final Logger logger = LoggerFactory.getLogger(DatabaseConfiguration.class);
    @Bean
    public DataSource dataSource() {

    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        sqlSessionFactoryBean.setTypeAliases(new Class[]{User.class});
        sqlSessionFactoryBean.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
        sqlSessionFactoryBean.setPlugins(new Interceptor[]{new MybatisSpringPageInterceptor()});
        return sqlSessionFactoryBean.getObject();
    }

    private <T> MapperFactoryBean getMapper(Class<T> mapperInterface) {
        MapperFactoryBean<T> mapperFactoryBean = new MapperFactoryBean<T>();
        try {
            mapperFactoryBean.setSqlSessionFactory(sqlSessionFactory());
            mapperFactoryBean.setMapperInterface(mapperInterface);
        } catch (Exception ex) {
            logger.error("error when create mapper: ", ex);
            throw new RuntimeException(ex);
        }
        return mapperFactoryBean;
    }

    @Bean
    public MapperFactoryBean userMapper() {
        return getMapper(UserMapper.class);
    }
*/

}