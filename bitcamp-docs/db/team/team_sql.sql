-- 유저
insert into users(user_no, user_name, birthday, gender, email, password, phone_number, zip_code,
                  basic_address, detail_address, photo, nickname) 
  values(101, '김명랑', '1990-03-09', 1, 'aaa@aaa.com', '1111', '010-2222-3333', 12194, 
        '강원도 영월군 주천면 평창강로 59','101호', 'a.gif', 'haha');
        
insert into users(user_no, user_name, birthday, gender, email, password, phone_number, zip_code,
                  basic_address, detail_address, photo, nickname) 
  values(102, '이발랄', '1993-12-20', 2, 'bbb@bbb.com', '1111', '010-5555-3333', 12135, 
        '강원도 춘천시 금강로 75-1','301호', 'g.gif', 'lala');


-- 포인트 내역
insert into points(point_no, user_no, trader_no, point_type, content, price) 
  values(101, 101, 102, 2, 1, 100);
  
-- 코스
insert into courses(course_no, user_no) value(101,101);

-- 코스 데이
insert into course_days(course_day_no, course_no, title, day_date) values(1, 101, '강남 여행', '2020-03-20' );
insert into course_days(course_day_no, course_no, title, day_date) values(2, 101, '숭례문 탐방', '2020-03-21' );
insert into course_days(course_day_no, course_no, title, day_date) values(3, 101, '남산타워산책', '2020-03-22' );


-- 방문장소
insert into course_places(place_no, course_day_no, place_name, place_address, etc) 
  values(101, 1, '서울 암사동 유적', '서울 강동구 올림픽로 875 암사선사유적전시관', '가을에 공원을 가는게 이쁨');
  
insert into course_places(place_no, course_day_no, place_name, place_address, etc) 
  values(102, 1, '랑데자뷰 강남점', '서울 강남구 봉은사로6길 39', '제주도를 모티브로함');
  
insert into course_places(place_no, course_day_no, place_name, place_address, etc) 
  values(103, 1, '육품', '서울 서초구 서초대로73길 30', '회식 장소라 항상 사람이 많음');
  
insert into course_places(place_no, course_day_no, place_name, place_address, etc) 
  values(104, 2, '숭례문', '서울 중구 세종대로 40', '간절기(3월~5월): 오전 9시-오후 6시');
  
insert into course_places(place_no, course_day_no, place_name, place_address, etc) 
  values(105, 2, '남대문시장', '서울 중구 남대문시장4길 21', '갈치와 칼국수 골목이 인기, 호떡 존맛');
  
insert into course_places(place_no, course_day_no, place_name, place_address, etc) 
  values(106, 3, '남산골 산채집', '서울 중구 소파로 93', '수요미식회에 나옴, 돈까스가 맛있음');
  
insert into course_places(place_no, course_day_no, place_name, place_address, etc) 
  values(107, 3, '더로열푸드앤드링크', '서울 용산구 신흥로20길 37', '뷰가 좋음');
  
insert into course_places(place_no, course_day_no, place_name, place_address, etc) 
  values(108, 3, '남산서울타워', '서울 용산구 남산공원길 103 서울타워우편물취급소', '11:00-22:00, 대인:11000원');
  

-- 리뷰
insert into reviews(review_no, user_no, status) values(101, 101, 1);

-- 데이리뷰
insert into review_days(review_day_no, main_photo, title, day_date, day_review, review_no, status)
  values(1, 'a.gif', '강남 여행', '2020-03-20', '유적이라고 해서 왜 추천하지 싶었는데 공원이 너무 
     이뻐서 가길 잘한 것 같다. 가을에 가보는 거 추천추천!!', 101, 1);
     
insert into review_days(review_day_no, main_photo, title, day_date, day_review, review_no, status)
  values(2, 'j.gif', '숭례문 탐방', '2020-03-21', '숭례문도 오랜만에 보는 거라 옛날 기억났고 
        남대문 시장에서 칼국수 먹었는데 진짜 인생 칼국수였어요 꼭 먹어보세요~', 101, 1);
     
insert into review_days(review_day_no, main_photo, title, day_date, day_review, review_no, status)
  values(3, 'h.gif', '남산 타워 산책', '2020-03-22', '남산은 몇 번 가봤지만 남산 타워는 처음 가보는데
        가는 이유가 있더라고요. 위에서 보는 야경이 너무 이뻤어요!! 돈까스도 친구 추천으로 가봤는데 
        너무 맛있었어요!! 그 주변 가실 일 있으면 한 번 드셔보시는거 추천드려요!!', 101, 1);

        
-- 장소 리뷰
insert into review_place(review_place_no, place_name, place_address, place_review, main_photo, review_day_no, status)
  values(101, '서울 암사동 유적', '서울 강동구 올림픽로 875 암사선사유적전시관', '친구 추천으로 
      갔는데 공원이 너무 좋았어요!', 'i.png', 1, 1);
      
insert into review_place(review_place_no, place_name, place_address, place_review, main_photo, review_day_no, status)
  values(102, '랑데자뷰 강남점', '서울 강남구 봉은사로6길 39', '제주도가 모티브라고 해서 가봤는데
        제주도 가고 싶은데 사정상 못가시는 분들이 리플레쉬하고 오면 좋을 것 같아요!!', 'e.png', 1, 1);
      
insert into review_place(review_place_no, place_name, place_address, place_review, main_photo, review_day_no, status)
  values(103, '육품', '서울 서초구 서초대로73길 30', '고기 맛집이라고 해서 갔는데 삼겹살이 진짜 
      맛있었어요! 담에 가면 돼지갈비도 먹어보려고요!! 저녁에 사람 많아서 좀 일찍 가는거 추천드려요~', 'w.png', 1, 1);
      
insert into review_place(review_place_no, place_name, place_address, place_review, main_photo, review_day_no, status)
  values(104, '숭례문', '서울 중구 세종대로 40', '숭례문은 처음 가봤는데 멋있었요 야간 개장할 때 
      가서 보면 되게 좋을 것 같아요', 'y.png', 2, 1);
      
insert into review_place(review_place_no, place_name, place_address, place_review, main_photo, review_day_no, status)
  values(105, '남대문시장', '서울 중구 남대문시장4길 21', '칼국수가 맛있다고 해서 친구랑 칼국수랑 
      만두 시켜서 먹었는데 진짜 너무 맛있었어요. 양도 많이 주셔서 진짜 배터지게 먹었네요ㅎㅎ', 'm.png', 2, 1);
      
insert into review_place(review_place_no, place_name, place_address, place_review, main_photo, review_day_no, status)
  values(106, '남산골 산채집', '서울 중구 소파로 93', '검색해봐서 맛집이라는거 알고 갔는데 진짜 
        기대 이상으로 맛있었어요. 돈까스 좋아하시는 분들 진짜 추천추천!!', 'u.png', 3, 1);
      
insert into review_place(review_place_no, place_name, place_address, place_review, main_photo, review_day_no, status)
  values(107, '더로열푸드앤드링크', '서울 용산구 신흥로20길 37', '밥먹고 뷰가 좋은 곳이 있다고 해서
      가봤는데 진짜 루프탑 최고였어요!!', 'a.png', 3, 1);
      
insert into review_place(review_place_no, place_name, place_address, place_review, main_photo, review_day_no, status)
  values(108, '남산서울타워', '서울 용산구 남산공원길 103 서울타워우편물취급소', '남산은 워낙 
      유명해서 가보신 분들이 많을텐데 전망대도 올라가 보시는거 진짜 추천드려요!! 야경이 진짜 이쁩니다!!', 'v.png', 3, 1);

-- 장소리뷰사진
insert into review_place_photo(photo_no, review_place_no, photo_file) values(101, 101, 'a.gif');

-- 인포장소
insert into info_places(place_no, start_date, last_date, place_name, place_address)
  values(110, '2020-03-31', '2020-04-20', '석촌호수', '서울 송파구 잠실동');
  
-- 인포(인포 중 이벤트)
insert into infos(info_no, category, content, main_photo, place_no) 
  values(101, 2, '석촌호수', 'p.png', 110);
  
-- 인포 사진
insert into info_photo(photo_no, info_no, photo_file)   values(101, 101, 'm.gif');
  
-- 유저장소스크랩
insert into place_scraps(user_no, review_place_no) values(101, 101);

-- 유저데이스크랩
insert into day_scraps(user_no, review_day_no) values(101, 1);

-- 유저 인포장소 스크랩
insert into info_scraps(user_no, place_no) values(101, 110);

