library(ggplot2)
library(dplyr)

boxplot(mpg$hwy)$stats
mpg$hwy=ifelse(mpg$hwy<12|mpg$hwy>37,NA,mpg$hwy)  
table(is.na(mpg$hwy))

mpg %>% group_by(drv) %>% summarise(mean_hwy=mean(hwy,na.rm=T))


mpg = as.data.frame(mpg)
mpg[c(10,14,58,93),"drv"]="k"
mpg[c(29,43,129,203),"cty"]=c(3,4,39,42)
table(mpg$drv)
mpg$drv=ifelse(mpg$drv!="k",mpg$drv,NA)
View(mpg)
mpg$drv=ifelse(mpg$drv==c("r","4","f"),mpg$drv,NA)

boxplot(mpg$cty)$stats

mpg$cty=ifelse(mpg$cty>=9&mpg$cty<=26,mpg$cty,NA)
boxplot(mpg$cty)
mpg %>% filter(!is.na(drv) & !is.na(cty)) %>% group_by(drv) %>% summarise(mean_cty=mean(cty))
mpg
