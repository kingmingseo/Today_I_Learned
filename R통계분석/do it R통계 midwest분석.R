midwest
summary(midwest)
midwest=rename(midwest,total=poptotal,asian=popasian)
View(midwest)
midwest$ratio_asian=(midwest$asian/midwest$total)*100
hist(midwest$ratio_asian)
AVG=mean(midwest$ratio_asian)
midwest$test=ifelse(midwest$ratio_asian>AVG,"large","small")
summary(midwest)
View(midwest)
AVG
table(midwest$test)
qplot(midwest$test)

