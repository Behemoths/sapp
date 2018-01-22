/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/1/22 ����һ 16:46:33                       */
/*==============================================================*/


drop table if exists SC_BASE_APPS;

/*==============================================================*/
/* Table: SC_BASE_APPS                                          */
/*==============================================================*/
create table SC_BASE_APPS
(
   ID                   varchar(64) not null default '1' comment 'ID',
   APP_CODE             varchar(64) not null comment 'Ӧ�ñ���',
   APP_NAME             varchar(128) comment 'Ӧ������',
   APP_URL              varchar(64) not null comment 'Ӧ�÷��ʵ�ַ',
   ENABLED_FLAG         varchar(1) not null default '0' comment '���ñ�־��Ĭ�ϣ�0��0��ͣ�ã�1�����ã�',
   DELETED_FLAG         varchar(1) not null default '0' comment 'ɾ����־��Ĭ�ϣ�0��0��δɾ����1����ɾ����',
   INNER_FLAG           varchar(1) not null default '0' comment '�ڽ���־',
   ACCESS_FLAG          varchar(1) not null default '0' comment 'ϵͳ�����ʱ�־��1���ǣ�ϵͳ���ʣ�0����ҳ����ʡ�',
   DISPLAY_ORDER        Integer(11) not null comment '��ʾ˳��',
   ENTITY_VERSION       bigint not null comment '���汾',
   CREATE_TIME          timestamp not null comment '����ʱ��',
   UPDATE_TIME          timestamp not null comment '�޸�ʱ��',
   primary key (ID)
);

