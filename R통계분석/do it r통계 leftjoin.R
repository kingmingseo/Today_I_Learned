test1 = data.frame(id = c(1,2,3,4,5),
                   midterm = c(60,80,70,90,85))
test2= data.frame(id = c(1,2,3,4,5),
                  final = c(70,83,65,95,80))
test1
test2
library(dplyr)
test3=left_join(test1,test2, by= "id")
test3

name= data.frame(class= c(1,2,3,4,5),
                 teacher=c("kim","lee","park","choi","jung"))
exam=read.csv("csv_exam.csv")

new_exam=left_join(exam,name,by="class")
new_exam

bind_rows(test1,test2)

fuel = data.frame(fl=c("c","d","e","p","r"),
                  price_f1=c(2.35,2.38,2.11,2.76,2.22),
                  stringsAsFactors = F)

new_mpg=left_join(mpg,fuel,by="fl")
new_mpg
library(ggplot2)
new_mpg %>% select(model,fl,price_f1) %>% head(5)
