# 项目介绍

## 简单
基于spring cloud微服务架构，框架使用SSM（spring+spring mvc+mybatis），默认使用数据库为mysql(用户可根据实际情况选择其他数据库)


## 目录结构

### 整体结构图
```
    |-- doc
        |-- db.sql
    |-- src
        |-- main
            |-- java
            |-- resources
        |-- test
    |-- pom.xml
    |-- README.md
```
### 整体目录结构说明
- doc: 存放项目的文档，如数据库脚本db.sql或者其他文档
- src: 存放项目源码
    - main: 业务源码
        - java: java源码目录
            - common: 公共部分
            - datasources: 数据源部分 
            - generation: 代码生成器部分
            - sys: 业务逻辑部分
        - resources: 配置文件目录 
            - mapper: mapper xml目录
            - application.properties: 基础配置文件，和application.yml作用同等，同二选一或者两者兼容
            - application.yml: spring boot/spring cloud格式的基础配置文件
            - application-XXX.yml: 不同环境下的配置文件，由基础配置文件通过spring.profiles.active指明不同环境
            - logback-spring.xml: logback日志配置文件
    - test: 测试源码
- pom.xml: maven配置文件
- README.md：本文件 

### 业务目录结构
```
    |-- sys
        |-- controller
        |-- dao
        |-- entity
        |-- model
        |-- service
```
### 业务目录结构说明
- controller :控制器，负责具体的业务模块流程的控制
- service: 业务层，主要负责业务模块的逻辑应用设计
- dao: 数据存储对象层，定义数据库操作
- entity: 数据库实体类包
- model: 实体类的模型，一般是用来返回给前端用

## demo使用说明

- 创建数据库，并修改application的数据库配置
- 使用doc/db.sql初始化数据
- 如果使用eureka做服务发现，请先从moria平台->基础设施中获取eureka服务器的地址及用户名和密码，并按实际情况修改（或自己搭建一个eureka server测试）
- 如果使用zipkin做链路追踪，请先从moria平台->基础设施中获取zipkin的服务地址，并按实际情况修改（或自己搭建一个zipkin server测试）
   
    


