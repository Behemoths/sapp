/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/1/22 星期一 16:46:33                       */
/*==============================================================*/


drop table if exists SC_BASE_APPS;

/*==============================================================*/
/* Table: SC_BASE_APPS                                          */
/*==============================================================*/
create table SC_BASE_APPS
(
   ID                   varchar(64) not null default '1' comment 'ID',
   APP_CODE             varchar(64) not null comment '应用编码',
   APP_NAME             varchar(128) comment '应用名称',
   APP_URL              varchar(64) not null comment '应用访问地址',
   ENABLED_FLAG         varchar(1) not null default '0' comment '启用标志。默认：0。0：停用；1：启用；',
   DELETED_FLAG         varchar(1) not null default '0' comment '删除标志。默认：0。0：未删除；1：已删除；',
   INNER_FLAG           varchar(1) not null default '0' comment '内建标志',
   ACCESS_FLAG          varchar(1) not null default '0' comment '系统级访问标志。1：是，系统访问；0：否，页面访问。',
   DISPLAY_ORDER        Integer(11) not null comment '显示顺序',
   ENTITY_VERSION       bigint not null comment '锁版本',
   CREATE_TIME          timestamp not null comment '创建时间',
   UPDATE_TIME          timestamp not null comment '修改时间',
   primary key (ID)
);

