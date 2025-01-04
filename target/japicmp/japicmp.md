
# Compatibility Report

![semver PATCH](https://img.shields.io/badge/semver-PATCH-yellow?logo=semver "semver PATCH")

## Summary

> [!IMPORTANT]
>
> Compatible bug fixes found while checking backward compatibility of version `1.9.0-SNAPSHOT` with the previous version `1.8.1`.

<details markdown="1">
<summary>Expand to see options used.</summary>

- **Report only summary**: No
- **Report only changes**: Yes
- **Report only binary-incompatible changes**: No
- **Access modifier filter**: `PROTECTED`
- **Old archives**:
  - ![commons-dbutils 1.8.1](https://img.shields.io/badge/commons_dbutils-1.8.1-blue "commons-dbutils 1.8.1")
- **New archives**:
  - ![commons-dbutils 1.9.0-SNAPSHOT](https://img.shields.io/badge/commons_dbutils-1.9.0_SNAPSHOT-blue "commons-dbutils 1.9.0-SNAPSHOT")
- **Evaluate annotations**: Yes
- **Include synthetic classes and class members**: No
- **Include specific elements**: No
- **Exclude specific elements**: No
- **Ignore all missing classes**: No
- **Ignore specific missing classes**: No
- **Treat changes as errors**:
  - Any changes: No
  - Binary incompatible changes: No
  - Source incompatible changes: No
  - Incompatible changes caused by excluded classes: Yes
  - Semantically incompatible changes: No
  - Semantically incompatible changes, including development versions: No
- **Classpath mode**: `ONE_COMMON_CLASSPATH`
- **Old classpath**:
```

```
- **New classpath**:
```

```

</details>


## Results

| Status   | Type                                                | Serialization       | Compatibility Changes |
|----------|-----------------------------------------------------|---------------------|-----------------------|
| Modified | [org.apache.commons.dbutils.BeanProcessor]          | ![Not serializable] | ![No changes]         |
| Modified | [org.apache.commons.dbutils.StatementConfiguration] | ![Not serializable] | ![No changes]         |

<details markdown="1">
<summary>Expand for details.</summary>

___

<a id="user-content-org.apache.commons.dbutils.beanprocessor"></a>
### `org.apache.commons.dbutils.BeanProcessor`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status   | Modifiers | Type  | Name            | Extends    | JDK                         | Serialization       | Compatibility Changes |
|----------|-----------|-------|-----------------|------------|-----------------------------|---------------------|-----------------------|
| Modified | `public`  | Class | `BeanProcessor` | [`Object`] | ~~JDK 8~~ &rarr; **JDK 11** | ![Not serializable] | ![No changes]         |


#### Methods

| Status | Modifiers                   | Generics | Type       | Method           | Annotations | Throws | Compatibility Changes |
|--------|-----------------------------|----------|------------|------------------|-------------|--------|-----------------------|
| Added  | **`final`** **`protected`** |          | **`void`** | **`finalize`**() |             |        | ![No changes]         |

___

<a id="user-content-org.apache.commons.dbutils.statementconfiguration"></a>
### `org.apache.commons.dbutils.StatementConfiguration`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status   | Modifiers | Type  | Name                     | Extends    | JDK                         | Serialization       | Compatibility Changes |
|----------|-----------|-------|--------------------------|------------|-----------------------------|---------------------|-----------------------|
| Modified | `public`  | Class | `StatementConfiguration` | [`Object`] | ~~JDK 8~~ &rarr; **JDK 11** | ![Not serializable] | ![No changes]         |


#### Methods

| Status | Modifiers                   | Generics | Type       | Method           | Annotations | Throws | Compatibility Changes |
|--------|-----------------------------|----------|------------|------------------|-------------|--------|-----------------------|
| Added  | **`final`** **`protected`** |          | **`void`** | **`finalize`**() |             |        | ![No changes]         |


</details>


___

*Generated on: 2025-01-04 11:29:26.438+0100*.

[No changes]: https://img.shields.io/badge/No_changes-green "No changes"
[Not serializable]: https://img.shields.io/badge/Not_serializable-green "Not serializable"
[`Object`]: # "java.lang.Object"
[org.apache.commons.dbutils.BeanProcessor]: #user-content-org.apache.commons.dbutils.beanprocessor
[org.apache.commons.dbutils.StatementConfiguration]: #user-content-org.apache.commons.dbutils.statementconfiguration
