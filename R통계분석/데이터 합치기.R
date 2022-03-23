#가로 합치기
exam=read.csv("exam.csv",header=T)

test1=data.frame(id=c(1,2,3,4,5), midterm=c(60,70,80,90,100))
test2=data.frame(id=c(1,2,3,4,5), final=c(30,60,79,50,98))
total=left_join(test1,test2,by="id")
total
teacher=data.frame(class=c(1,2,3,4,5),teacher=c("Kim","Lee","Park","Choi","Jung"))

new_data=left_join(exam,teacher,by="class")
new_data

#세로 합치기
group_a=data.frame(id=c(1,2,3,4,5),test=c(60,4,5,8,9))
group_b=data.frame(id=c(5,6,7,8,9),test=c(81,68,16,57,56))
group_all=bind_rows(group_a,group_b)
group_all
