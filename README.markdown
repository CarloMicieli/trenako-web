# Trenako (web api)

[![MIT License](https://img.shields.io/apm/l/atomic-design-ui.svg?)](https://github.com/tterb/atomic-design-ui/blob/master/LICENSEs)
![GitHub last commit](https://img.shields.io/github/last-commit/CarloMicieli/trenako-web)
![GitHub top language](https://img.shields.io/github/languages/top/CarloMicieli/trenako-web)
[![dev](https://github.com/CarloMicieli/trenako-web/actions/workflows/dev.yml/badge.svg)](https://github.com/CarloMicieli/trenako-web/actions/workflows/dev.yml)

A web api for model railway collections

## Tech Stack

* `Kotlin`
* `JDK 11`
* `Gradle`

## Run Locally

Clone the project

```bash
  git clone https://github.com/CarloMicieli/trenako-web.git
```

Go to the project directory

```bash
  cd trenako-web
```

to run the `postgres` database:

```bash
  docker run --rm --name postgres-dev \
    -e POSTGRES_PASSWORD=mysecretpassword \
    -e POSTGRES_DB=trenako \
    -d -p 5432:5432 -v postgres_data_dev:/var/lib/postgresql/data postgres
````

```bash
  ./gradlew webapi:run
  
    > Task :webapi:run
     __  __ _                                  _   
    |  \/  (_) ___ _ __ ___  _ __   __ _ _   _| |_ 
    | |\/| | |/ __| '__/ _ \| '_ \ / _` | | | | __|
    | |  | | | (__| | | (_) | | | | (_| | |_| | |_ 
    |_|  |_|_|\___|_|  \___/|_| |_|\__,_|\__,_|\__|
      Micronaut (v2.5.5)
    
INFO  io.micronaut.runtime.Micronaut - Startup completed in 2198ms. Server Running: http://localhost:8080
```

## Project layout

* `common` common code for the remaining projects
* `catalog` the catalog module
* `collecting` the collecting module
* `social` the accounts module
* `webapi` the restful web api

## Contributing

Contributions are always welcome!

See `contributing.md` for ways to get started.

Please adhere to this project's `code of conduct`.

### Conventional commits

This repository is following the conventional commits practice.

#### Enforcing using git hooks

```bash
  git config core.hooksPath .githooks
```

The hook itself can be found in `.githooks/commit-msg`.

#### Using Commitizen

Install [commitizen](https://github.com/commitizen-tools/commitizen)

```bash
  pip install commitizen
```

and then just use it

```bash
  cz commit
```

## License

[MIT License](https://choosealicense.com/licenses/mit/)

```
Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```