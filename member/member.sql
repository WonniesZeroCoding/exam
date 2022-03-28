select * from MEMBER;

-- 주소(1) / 이메일(2) 변경
update MEMBER
set addr ='서울시 구로구'
where id = 1;

update MEMBER
set email = 'hong@naver.com'
where id = 1;

