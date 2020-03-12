package com.person.mybatisplusdemo.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class MyBatisPlusConfig {

    //要生成的表名
    private static String[] tables= {"user"};

    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();

        // *****数据源配置******
        DataSourceConfig dsc = new DataSourceConfig();

        dsc.setDbType(DbType.MARIADB);
        dsc.setDriverName("org.mariadb.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("761943");
        dsc.setUrl("jdbc:mariadb://127.0.0.1:3306/demo?useSSL=false");
        mpg.setDataSource(dsc);

        // *****全局配置*****
        GlobalConfig gc = new GlobalConfig();

        //输出文件路径
        gc.setOutputDir("D:\\WorkSpace\\mybatis-plus-demo\\src\\main\\java\\");
        //文件存在时是否覆盖文件
        gc.setFileOverride(false);
        // 不需要ActiveRecord特性的请改为false
        gc.setActiveRecord(false);
        // XML 二级缓存
        gc.setEnableCache(false);
        // XML ResultMap
        gc.setBaseResultMap(true);
        // XML columList
        gc.setBaseColumnList(true);
        // 作者
        gc.setAuthor("zhoujiehao");
        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        gc.setControllerName("%sController");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");

        mpg.setGlobalConfig(gc);

        // *****策略配置******
        StrategyConfig strategy = new StrategyConfig();
        // 表前缀
        // strategy.setTablePrefix(new String[] { "sys_" });
        // 表名生成策略
        strategy.setNaming(NamingStrategy.underline_to_camel);
        // 需要生成的表
        strategy.setInclude(tables);

        strategy.setSuperServiceClass(null);
        strategy.setSuperServiceImplClass(null);
        strategy.setSuperMapperClass(null);

        mpg.setStrategy(strategy);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.person.mybatisplusdemo");
        pc.setController("controller");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        pc.setMapper("dao");
        pc.setEntity("entity");
        pc.setXml("xml");
        mpg.setPackageInfo(pc);

        // 执行生成
        mpg.execute();

    }
}
