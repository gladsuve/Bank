CREATE TABLE t_board (
    no  number(5) primary key,
    title varchar2(200) not null,
    writer varchar2(50) not null,
    content varchar2(4000) not null,
    view_cnt  number(5) default 0,
    reg_date date default sysdate

);

CREATE sequence seq_t_board_no;


-- 1번부터 순차적으로 뽑고 싶을 때!


SELECT *
FROM t_board;

insert into t_board(no, title, writet, content) values(seq_t_board_no.nextval, '제목입니다!', '홍길동', '내용입니다!');
insert into t_board(no, title, writet, content) values(seq_t_board_no.nextval, '제목입니다##', '홍길동', '내용입니다##');


commit;

ALTER TABLE t_board RENAME COLUMN writet to writer;

commit;