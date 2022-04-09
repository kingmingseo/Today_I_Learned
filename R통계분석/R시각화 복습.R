plot(10:1)

split.screen(c(2,1))
  

split.screen(c(1,3),screen=2)

screen(1)
plot(10:1)
screen(4)
plot(1:10)
dev.off()
close.screen(all=TRUE)
x= seq(1,10,0.1)
y=exp(x)
plot(x,y,xlab="minseo",ylab="good",type="o")


data=ToothGrowth
plot(ToothGrowth)
ggplot(data=ToothGrowth,aes(x=len,y=dose))+geom_point()
plot(ToothGrowth$len,ToothGrowth$dose,xlab="Length",ylab = "Dose",main="Tooth Growth according to Dose")


