<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<!-- Include header.html -->
    <jsp:include page="include/header.jsp" />
	<!-- 컨텐츠 -->
		<div class="contents">
					<!-- 게시물 업로드 박스 -->
						<h2 class="tit">무인마켓 회원가입</h2>
						<form action="" method="" >
							<div class="uploadBox">
								<div class="uploadFlex">
									<label for="fileup2">사진 업로드</label>
									<input type="file" name="fileup2" >	
								</div>	
								<div class="uploadFlex">
									<label for="title">타이틀</label>
									<input type="text" name="title" >	
								</div>
								<div class="uploadFlex">
									<label for="name">가격</label>
									<input type="number" name="name" >	
								</div>
								<div class="uploadFlex">
									<label for="name">글작성</label>
									<textarea id="story" name="story" rows="5" cols="100">
									</textarea>
								</div>		
							</div><!-- // uploadBox -->
							<div class="btnBox">
								<button type="button" class="backBtn btn">뒤로가기</button>					
								<button type="submit" class="submitBtn btn">등록하기</button>
							</div>
						</form>
				</div><!-- // contents -->
	<!-- Include header.html -->
    <jsp:include page="include/footer.jsp" />
	 
