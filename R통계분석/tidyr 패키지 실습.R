install.packages("tidyr")
library(tidyr)
library(dplyr)

#complte함수 실습
df=tibble(
  year=c(2010,2010,2010,2010,2012,2012,2012),
  qtr=c(1,2,3,4,1,2,3),
  revenue=c(10,20,30,40,NA,60,70)
)

df
df%>%complete(year=full_seq(year,1), qtr)

#gather 함수 실습
gather=tibble(
  country=c("Afghanistan","Brazil","China"),
  "1999"=c(745,37745,212258),
  "2000"=c(2666,80268,213766)
)
gather
gather%>%gather("1999","2000",key="year",value="cases")

#separate 함수 실습

separate=tibble(
  country=c("Afghanistan","Afghanistan","Brazil","Brazil","China","China"),
  year=c(1999,2000,1999,2000,1999,2000),
  rate=c(745/1948169,2566/156156651,846/651651165,8789/65412321,8516/44446455,86/8898)
)
separate%>%separate(rate, into=(c("cases","population")))

#spread 함수 실습
spread=tibble(
  country=c("Afghanistan","Afghanistan","Afghanistan","Afghanistan","Brazil","Brazil","Brazil","Brazil","China","China","China","China"),
  year=c(1999,1999,2000,2000,1999,1999,2000,2000,1999,1999,2000,2000),
  type=c("cases","pop","cases","pop","cases","pop","cases","pop","cases","pop","cases","pop"),
  count=c(654,8794561,152,4864513,451,654651,465,48956165,645,656526,123,54689)
)
spread%>%spread(key="type",value="count")
