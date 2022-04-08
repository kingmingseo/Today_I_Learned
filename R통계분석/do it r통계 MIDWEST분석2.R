library(ggplot2)
library(dplyr)
midwest
midwest=midwest %>% mutate(ratio_=(100-((popadults/poptotal)*100)))
midwest %>% select(county,ratio_) %>% arrange(desc(ratio_)) %>% head(5)
midwest=midwest %>% mutate(grade=ifelse(ratio_>=40,"large",ifelse(ratio_>=30,"middle","small")))
table(midwest$grade)

midwest %>% mutate(asian_ratio=popasian/poptotal*100) %>% select(state,county,asian_ratio) %>% arrange(asian_ratio) %>% head(10)

