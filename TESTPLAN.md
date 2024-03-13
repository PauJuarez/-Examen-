### TESTPLAN
1. Only brackets return true. `[ ]`
2. Nested brackets are allowed. `['[]']`
3. Brackets whith text. `[hola]`
4. Two brackets of each type. `[hola] [mon]`
5. Two square brackets with other characters allowd. `[hola] {mon}`
6. Only one bracket, that failed. `[`
7. The other one bracket, that failed. `]`
8. Whit out brackets are allowed. ` "  "`
9. Whit tow open brackets and one other are falied. `[[]`
10. Whit tow open brackets and one other are falied. `[]]`
11. Wrong orther brackets are falied. `][`
12. Double wrong orther brackets are falied. `[]][`
13. Whit text infrot brackets are allowed. `hola[]`
14. Whit text before brackets are allowed. `[]que tal`
