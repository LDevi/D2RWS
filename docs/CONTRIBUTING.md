# Contributing
## How can you help ?

You can help in several ways:
- by making remarks or suggestions for improvement as well on the content or the features of the application.
- helping to develop the code by opening PRs.
- by providing information on the function and game mechanisms present in the application (breakpoints, formulas, etc.)
- by making images that will be used in the application (launch icons, images of objects, logos ...).

In any case, if you want to participate you can open 
[a new issue](https://github.com/LDevi/Diablo-2-App-Assistant/issues/new) or start making the next planned [additions](https://github.com/LDevi/Diablo-2-App-Assistant/projects)

## Sending your contribution (code, any documents, images resources...)
### Gitflow
The development flow used on this project is based on [this blog post by Vincent Driessen](http://nvie.com/posts/a-successful-git-branching-model).

In a few words :

- the `master` branch contains the code published in production
- the `hotfix` branch to develop patches for production
- the `release` branch contains the next version (used for google play store in beta version)
- the `develop` branch contains the version being developed
- `feature branches` are for each and every increments, it is actually only on these branches that code is pushed. These branches, when the increment is done, are merged to `develop` via push requests.

So make sure you are branching from the right place.

### Commit messages format
Each commit message contains the following information, the that order :
- The version for which the increment is developed (**mandatory**) : [1.0.0] or [1.2.3] (tree digits, major, minor, patch).
- The affected opened issue (**where appropriate**) : [#666].
- The scope of the changes (**where appropriate**) : [technical], [runes],... these are references to [level 1 labels](https://github.com/LDevi/Diablo-2-App-Assistant/labels).
- A brief description of the changes content (**mandatory**).

ex : `[1.0.0][#10][technical] Initialize technical doc.`

## Images / UI resources.

- Favor images in vector form (svg).
- Provide, where possible, the sources of your productions (.psd, .project, .xml ...) either by sending it to git or in a issue, so anyone can modify and evolve it easily.

## Code conventions
The way of coding differs from one developer to another and there is no better way. Despite this, for reasons of readability and clarity, it is requested to respect the style and conventions used at least within the same module.

### Language
- Use Kotlin has much as possible.
- Do not use Hungarian notation.

### Respect the multi-modules setup and the different layers
This is a project divided into several modules.
Each module has a specialized scope and has the least possible dependencies to the other modules.
So please:
- respect the scope (technical and functional) of each module,
- avoid adding new dependencies,
- add a new module rather than overloading an existing one.
- stick to the project architecture in different layers : 
[Application architecture diagram](technical/Application-arch-diagram.png)


## Discuss

Feel free to discuss any part of this project by opening  
[a new issue](https://github.com/LDevi/Diablo-2-App-Assistant/issues/new).