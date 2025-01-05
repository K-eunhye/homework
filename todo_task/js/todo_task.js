//DOM요소 가져오기
const taskList = document.querySelector(".taskList");
const chBox = document.querySelector("input[type=checkbox]");
const delBtn = document.querySelector(".delete");
const addBtn = document.querySelector("#addBtn");

//할일 추가 버튼 누르면 창 뜨게 하기

// 항목 추가 함수
function addItem() {
    
    let list = prompt("할 일을 추가하세요"); 
    
    //아무것도 없다면 추가 못해
    if (list === "") { 
      alert("아무것도 입력하지 않으셨습니다");
      return;
    }else if(list === null) {
        return;
    }
  
    // 새로운 li 요소 생성
    const li = document.createElement("li");
    li.innerHTML = `<input type="checkbox">${list} <button class="delete">삭제</button>`;
  
    // 리스트에 추가
    taskList.appendChild(li);
  
    // 입력 필드 초기화
    // newItemInput.value = "";
  
    // 새로 추가된 삭제 버튼에 이벤트 리스너 연결
    li.querySelector(".delete").addEventListener("click", deleteItem);
    li.querySelector(".chBox").addEventListener("click", changeBg);
  }

  // 항목 삭제 함수
function deleteItem(event) {
    let check = confirm("정말 삭제하려구요?") ;
    if(check === true){
        const listItem = event.target.parentElement; // 삭제 버튼의 부모 요소 (li)
        taskList.removeChild(listItem); // li 삭제
    }else if(check === false){
        return;
    }    
  }

  // 할일추가 버튼 클릭 이벤트
  addBtn.addEventListener("click", addItem);

//체크박스 체크시 리스트 색상 바꾸기
function changeBg(event)  {
    //  let parentList = this.parentElement('li').getAttribute("backgroundColor");
    // event.target.checked ? parentList.setAttribute("backgroundColor", "coral"):parentList.setAttribute("backgroundColor", "white");
    if(event.target.checked){
        $(".chBox").parent().css("border", "1px solid red");  
    }else{
        $(".chBox").parent().css("border", "none");  
    }
    

}