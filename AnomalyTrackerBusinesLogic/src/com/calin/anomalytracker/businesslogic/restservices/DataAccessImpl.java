package com.calin.anomalytracker.businesslogic.restservices;

public class DataAccessImpl implements DataAccess{

	private static final String responseAsText = "{\"exceptionList\": [{\"timeStamp\": \"2015-01-26 19:21:24.592\", \"serverName\": \"WEB2\", \"exceptionName\": \"System.ArgumentNullException\", \"id\": \"a36bb0fd-9594-4273-911f-817972b88e86\", \"area\": \"Gateway/Com.AidBuilder.GatewayFacades.GatewayFacadeBase`1\"}, {\"timeStamp\": \"2015-01-25 00:52:38.684\", \"serverName\": \"WEB2\", \"exceptionName\": \"System.ArgumentNullException\", \"id\": \"621950fc-c291-4d8d-b3f5-a56891b5291c\", \"area\": \"Gateway/Winorg\"}, {\"timeStamp\": \"2015-01-26 09:20:05.304\", \"serverName\": \"WEB3\", \"exceptionName\": \"Amazon.S3.AmazonS3Exception\", \"id\": \"295a0417-27d1-42de-9738-897fcaff5a08\", \"area\": \"Gateway/Checkout\"}, {\"timeStamp\": \"2015-01-25 03:41:02.931\", \"serverName\": \"WEB1\", \"exceptionName\": \"Autofac.Core.DependencyResolutionException\", \"id\": \"d5a3c3ee-0771-4507-86f7-7bcd1b740f78\", \"area\": \"Gateway/Netaxept\"}, {\"timeStamp\": \"2015-01-25 14:33:38.319\", \"serverName\": \"WEB3\", \"exceptionName\": \"Amazon.S3.AmazonS3Exception\", \"id\": \"42c2994a-6dad-434e-98e1-e095f60d68ac\", \"area\": \"Gateway/AbInvoice\"}, {\"timeStamp\": \"2015-01-26 07:11:12.789\", \"serverName\": \"WEB1\", \"exceptionName\": \"System.Web.HttpException\", \"id\": \"5632cc91-4f73-4e38-99e1-ffe314f8b3a0\", \"area\": \"Gateway/Checkout\"}, {\"timeStamp\": \"2015-01-25 13:23:23.787\", \"serverName\": \"WEB1\", \"exceptionName\": \"System.ArgumentNullException\", \"id\": \"cb467b62-fc43-4f3e-927d-c76371a8d494\", \"area\": \"Gateway/Checkout\"}, {\"timeStamp\": \"2015-01-25 19:50:26.214\", \"serverName\": \"WEB1\", \"exceptionName\": \"Amazon.S3.AmazonS3Exception\", \"id\": \"ecac1934-7465-4599-a87d-20a6a89aae1b\", \"area\": \"Gateway/Checkout\"}, {\"timeStamp\": \"2015-01-26 06:57:46.107\", \"serverName\": \"WEB4\", \"exceptionName\": \"System.ArgumentNullException\", \"id\": \"1cf711c1-3c2b-4db1-8624-b4495dadd466\", \"area\": \"Exception\"}, {\"timeStamp\": \"2015-01-26 04:52:15.411\", \"serverName\": \"WEB2\", \"exceptionName\": \"System.SystemException\", \"id\": \"a4144360-f4ad-4b31-b1cf-b757cfdc8f25\", \"area\": \"Gateway/PayPal\"}, {\"timeStamp\": \"2015-01-25 07:05:36.314\", \"serverName\": \"WEB2\", \"exceptionName\": \"System.SystemException\", \"id\": \"2ba97b35-89b7-4e07-b5c3-6a19400fc9e7\", \"area\": \"Gateway/Checkout\"}, {\"timeStamp\": \"2015-01-26 01:57:02.505\", \"serverName\": \"WEB3\", \"exceptionName\": \"Autofac.Core.DependencyResolutionException\", \"id\": \"1cb0d504-30e3-482d-8806-36b9d141df72\", \"area\": \"ErrorMsg\"}, {\"timeStamp\": \"2015-01-25 14:02:12.572\", \"serverName\": \"WEB4\", \"exceptionName\": \"System.Web.HttpException\", \"id\": \"43e419f5-6576-4f7f-876b-9e585240b6eb\", \"area\": \"Gateway/Netaxept\"}, {\"timeStamp\": \"2015-01-25 18:26:03.013\", \"serverName\": \"WEB4\", \"exceptionName\": \"System.ArgumentNullException\", \"id\": \"81a4336c-60a7-4f54-bd20-abb38dc0e375\", \"area\": \"Gateway/GestPay\"}, {\"timeStamp\": \"2015-01-25 04:49:00.169\", \"serverName\": \"WEB3\", \"exceptionName\": \"Autofac.Core.DependencyResolutionException\", \"id\": \"82a8807d-cfdf-47d1-9373-c95c10984821\", \"area\": \"Gateway/GestPay\"}, {\"timeStamp\": \"2015-01-26 23:08:39.848\", \"serverName\": \"WEB3\", \"exceptionName\": \"System.ArgumentException\", \"id\": \"8eb4c0eb-d690-48c6-9507-333027b5ae1d\", \"area\": \"Gateway/Checkout\"}, {\"timeStamp\": \"2015-01-25 20:16:10.670\", \"serverName\": \"WEB3\", \"exceptionName\": \"System.ArgumentNullException\", \"id\": \"6a20e600-a8f3-45cf-a1af-2f0cb86f6a76\", \"area\": \"Gateway/Checkout\"}, {\"timeStamp\": \"2015-01-25 10:06:58.677\", \"serverName\": \"WEB3\", \"exceptionName\": \"System.ArgumentNullException\", \"id\": \"6d197c81-71d4-4eb9-84ee-82fae60487ac\", \"area\": \"Gateway/Checkout\"}, {\"timeStamp\": \"2015-01-26 00:00:08.167\", \"serverName\": \"WEB1\", \"exceptionName\": \"System.SystemException\", \"id\": \"9d2e1401-6425-4dc2-8325-f38d839ebda8\", \"area\": \"Gateway/Dibs\"}, {\"timeStamp\": \"2015-01-25 23:34:57.867\", \"serverName\": \"WEB2\", \"exceptionName\": \"System.Web.HttpException\", \"id\": \"d559abe3-f649-4fa9-a265-b059bb3e9514\", \"area\": \"Gateway/Netaxept\"}, {\"timeStamp\": \"2015-01-26 08:13:57.760\", \"serverName\": \"WEB4\", \"exceptionName\": \"System.Web.HttpException\", \"id\": \"e7ec1ecd-2546-417c-92f3-71fb718f9af7\", \"area\": \"Gateway/Netaxept\"}, {\"timeStamp\": \"2015-01-26 08:46:33.455\", \"serverName\": \"WEB4\", \"exceptionName\": \"Amazon.S3.AmazonS3Exception\", \"id\": \"8f01a44a-9cad-4703-9ea3-6f968d344d4e\", \"area\": \"Gateway/Netaxept\"}, {\"timeStamp\": \"2015-01-25 23:00:29.745\", \"serverName\": \"WEB1\", \"exceptionName\": \"System.ArgumentException\", \"id\": \"7b44e7a0-e276-4c70-8f8c-2b39d46645fd\", \"area\": \"Gateway/Winorg\"}, {\"timeStamp\": \"2015-01-26 20:34:44.671\", \"serverName\": \"WEB1\", \"exceptionName\": \"System.ArgumentNullException\", \"id\": \"2815e17c-ba8c-4242-8944-b566eeeefa26\", \"area\": \"Gateway/PayEx\"}, {\"timeStamp\": \"2015-01-26 14:52:21.809\", \"serverName\": \"WEB1\", \"exceptionName\": \"System.ArgumentException\", \"id\": \"8118280d-86ef-4932-8e2d-aa1db9e3033c\", \"area\": \"Gateway/GestPay\"}, {\"timeStamp\": \"2015-01-26 09:13:19.130\", \"serverName\": \"WEB1\", \"exceptionName\": \"System.SystemException\", \"id\": \"a262cbbd-6e25-4a46-824c-375afe79b159\", \"area\": \"Gateway/Com.AidBuilder.GatewayFacades.GatewayFacadeBase`1\"}, {\"timeStamp\": \"2015-01-26 03:37:01.119\", \"serverName\": \"WEB2\", \"exceptionName\": \"System.SystemException\", \"id\": \"398c8771-ee00-401f-8711-303f9d0618cc\", \"area\": \"Gateway/GestPay\"}, {\"timeStamp\": \"2015-01-25 20:43:52.487\", \"serverName\": \"WEB4\", \"exceptionName\": \"Autofac.Core.DependencyResolutionException\", \"id\": \"fed10fee-d797-4620-a830-087628e52ced\", \"area\": \"Gateway/Com.AidBuilder.GatewayFacades.GatewayFacadeBase`1\"}, {\"timeStamp\": \"2015-01-26 23:00:20.339\", \"serverName\": \"WEB3\", \"exceptionName\": \"System.ArgumentNullException\", \"id\": \"78ede639-6243-4d0b-a5cb-7bf99979a84b\", \"area\": \"Gateway/GestPay\"}, {\"timeStamp\": \"2015-01-26 12:06:41.719\", \"serverName\": \"WEB2\", \"exceptionName\": \"Amazon.S3.AmazonS3Exception\", \"id\": \"d00ddc37-5978-45ee-a175-0cd67be8fe0f\", \"area\": \"Gateway/Com.AidBuilder.GatewayFacades.GatewayFacadeBase`1\"}, {\"timeStamp\": \"2015-01-25 14:00:46.537\", \"serverName\": \"WEB1\", \"exceptionName\": \"System.ArgumentNullException\", \"id\": \"61c3392f-65d7-4d8f-a76a-1d57bcb182fd\", \"area\": \"Gateway/PayEx\"}, {\"timeStamp\": \"2015-01-25 17:50:54.188\", \"serverName\": \"WEB2\", \"exceptionName\": \"Amazon.S3.AmazonS3Exception\", \"id\": \"d78c8812-dfc3-4bfc-8fb2-d13533e14f83\", \"area\": \"Gateway/Dibs\"}, {\"timeStamp\": \"2015-01-26 02:39:54.467\", \"serverName\": \"WEB3\", \"exceptionName\": \"System.ArgumentException\", \"id\": \"09edd3ee-270e-418b-98d8-949e2cf097b9\", \"area\": \"ErrorMsg\"}, {\"timeStamp\": \"2015-01-26 17:44:51.230\", \"serverName\": \"WEB1\", \"exceptionName\": \"System.SystemException\", \"id\": \"08a820e1-db58-49f0-a565-0065e08fffc6\", \"area\": \"Gateway/PayPal\"}, {\"timeStamp\": \"2015-01-26 03:21:22.385\", \"serverName\": \"WEB3\", \"exceptionName\": \"Autofac.Core.DependencyResolutionException\", \"id\": \"022310de-f052-4bb3-a376-7483d18a7b2e\", \"area\": \"Gateway/Checkout\"}, {\"timeStamp\": \"2015-01-26 11:54:05.961\", \"serverName\": \"WEB1\", \"exceptionName\": \"System.SystemException\", \"id\": \"2242e453-2d6d-4588-9c52-3fd39aaed9e9\", \"area\": \"Gateway/Checkout\"}, {\"timeStamp\": \"2015-01-26 09:05:19.698\", \"serverName\": \"WEB1\", \"exceptionName\": \"System.Web.HttpException\", \"id\": \"727e7a71-8608-4d44-86f4-31add9b485f6\", \"area\": \"Gateway/GestPay\"}, {\"timeStamp\": \"2015-01-26 18:26:06.669\", \"serverName\": \"WEB2\", \"exceptionName\": \"Amazon.S3.AmazonS3Exception\", \"id\": \"e2a0e4da-3869-4042-a46a-d086dd331a68\", \"area\": \"Gateway/Netaxept\"}, {\"timeStamp\": \"2015-01-25 12:54:00.786\", \"serverName\": \"WEB3\", \"exceptionName\": \"System.Web.HttpException\", \"id\": \"d7a6f7c9-3b94-4ee6-a58e-6c85e153bcaa\", \"area\": \"Exception\"}, {\"timeStamp\": \"2015-01-25 20:30:00.897\", \"serverName\": \"WEB1\", \"exceptionName\": \"System.SystemException\", \"id\": \"e5537b4b-09e6-44bc-a321-739151cac987\", \"area\": \"Exception\"}, {\"timeStamp\": \"2015-01-25 07:20:16.415\", \"serverName\": \"WEB2\", \"exceptionName\": \"System.ArgumentNullException\", \"id\": \"8f90ec0d-8520-4dcf-ac1c-1685ba7f67b1\", \"area\": \"Gateway/Checkout\"}, {\"timeStamp\": \"2015-01-25 21:43:32.161\", \"serverName\": \"WEB2\", \"exceptionName\": \"Autofac.Core.DependencyResolutionException\", \"id\": \"4e460c0b-2c5f-4e0d-9eda-a32323dafb04\", \"area\": \"Gateway/GestPay\"}, {\"timeStamp\": \"2015-01-26 18:12:49.508\", \"serverName\": \"WEB2\", \"exceptionName\": \"System.ArgumentNullException\", \"id\": \"a706e7fb-fe43-49fc-9f68-fc9032dd77c2\", \"area\": \"ErrorMsg\"}, {\"timeStamp\": \"2015-01-26 21:31:24.381\", \"serverName\": \"WEB2\", \"exceptionName\": \"Amazon.S3.AmazonS3Exception\", \"id\": \"2a98520d-c403-427a-934e-dbae5cfd90eb\", \"area\": \"Gateway/AbInvoice\"}, {\"timeStamp\": \"2015-01-25 11:51:14.062\", \"serverName\": \"WEB1\", \"exceptionName\": \"Amazon.S3.AmazonS3Exception\", \"id\": \"fb53c5f2-6b2c-4f46-99ba-fca081a08795\", \"area\": \"Gateway/GestPay\"}, {\"timeStamp\": \"2015-01-26 00:02:15.535\", \"serverName\": \"WEB3\", \"exceptionName\": \"Autofac.Core.DependencyResolutionException\", \"id\": \"6f4ef02b-cf39-45d1-bd03-ae68f94873a0\", \"area\": \"Gateway/PayEx\"}, {\"timeStamp\": \"2015-01-26 19:35:41.253\", \"serverName\": \"WEB2\", \"exceptionName\": \"Autofac.Core.DependencyResolutionException\", \"id\": \"9a50e68e-312d-4332-9e5d-7cdeda672f31\", \"area\": \"Gateway/Paytrail\"}, {\"timeStamp\": \"2015-01-26 09:24:09.880\", \"serverName\": \"WEB4\", \"exceptionName\": \"System.SystemException\", \"id\": \"239ac4e8-957f-4cd2-b515-59efb3e1f330\", \"area\": \"Gateway/PayPal\"}, {\"timeStamp\": \"2015-01-25 11:11:44.590\", \"serverName\": \"WEB4\", \"exceptionName\": \"System.ArgumentException\", \"id\": \"6c4a0c55-89b8-4f52-a06c-4e796b6bf0ad\", \"area\": \"ErrorMsg\"}, {\"timeStamp\": \"2015-01-26 11:05:22.490\", \"serverName\": \"WEB4\", \"exceptionName\": \"Autofac.Core.DependencyResolutionException\", \"id\": \"450b61b7-0209-416b-b470-48139b9e5fb5\", \"area\": \"Gateway/Winorg\"}, {\"timeStamp\": \"2015-01-26 18:02:23.806\", \"serverName\": \"WEB3\", \"exceptionName\": \"System.Web.HttpException\", \"id\": \"b6df3133-3ee8-488b-8687-4f3382be9049\", \"area\": \"Exception\"}, {\"timeStamp\": \"2015-01-25 17:53:47.380\", \"serverName\": \"WEB4\", \"exceptionName\": \"Amazon.S3.AmazonS3Exception\", \"id\": \"3de42a5f-da9f-4ab1-9d0f-b9e09052f895\", \"area\": \"Gateway/Paytrail\"}, {\"timeStamp\": \"2015-01-26 03:28:12.815\", \"serverName\": \"WEB2\", \"exceptionName\": \"System.SystemException\", \"id\": \"c3a96fbb-0d5d-4b7c-99f8-b124afda7687\", \"area\": \"Gateway/PayEx\"}, {\"timeStamp\": \"2015-01-25 00:30:23.705\", \"serverName\": \"WEB4\", \"exceptionName\": \"Autofac.Core.DependencyResolutionException\", \"id\": \"0dd689e9-7d40-45f1-96cf-6c0de3f7c3c8\", \"area\": \"Gateway/PayPal\"}, {\"timeStamp\": \"2015-01-26 04:30:04.755\", \"serverName\": \"WEB2\", \"exceptionName\": \"System.ArgumentNullException\", \"id\": \"91ab2ca3-4fb6-481b-9ab1-be1344223e4d\", \"area\": \"Exception\"}, {\"timeStamp\": \"2015-01-26 16:54:09.532\", \"serverName\": \"WEB4\", \"exceptionName\": \"System.Web.HttpException\", \"id\": \"1de43549-6f26-4568-8074-1313d0ba8159\", \"area\": \"ErrorMsg\"}, {\"timeStamp\": \"2015-01-26 01:17:07.224\", \"serverName\": \"WEB3\", \"exceptionName\": \"Amazon.S3.AmazonS3Exception\", \"id\": \"61b59334-6735-483a-8e40-a7a65be8fb62\", \"area\": \"Gateway/Netaxept\"}, {\"timeStamp\": \"2015-01-25 14:45:02.691\", \"serverName\": \"WEB2\", \"exceptionName\": \"Amazon.S3.AmazonS3Exception\", \"id\": \"ec5a2f07-ba88-4e27-9071-8f5aa2681816\", \"area\": \"Gateway/Com.AidBuilder.GatewayFacades.GatewayFacadeBase`1\"}, {\"timeStamp\": \"2015-01-25 11:18:02.210\", \"serverName\": \"WEB2\", \"exceptionName\": \"Amazon.S3.AmazonS3Exception\", \"id\": \"35960130-db2d-48ce-8f28-497a41f6d6b5\", \"area\": \"ErrorMsg\"}, {\"timeStamp\": \"2015-01-26 20:53:54.022\", \"serverName\": \"WEB4\", \"exceptionName\": \"Amazon.S3.AmazonS3Exception\", \"id\": \"22523043-011c-4574-a3f6-e85cdcec055e\", \"area\": \"Gateway/Dibs\"}, {\"timeStamp\": \"2015-01-26 00:27:15.592\", \"serverName\": \"WEB1\", \"exceptionName\": \"System.ArgumentNullException\", \"id\": \"ae2ae131-dbcd-4c7a-8f56-ae54e98fbd76\", \"area\": \"Gateway/Dibs\"}, {\"timeStamp\": \"2015-01-25 17:10:36.777\", \"serverName\": \"WEB2\", \"exceptionName\": \"Amazon.S3.AmazonS3Exception\", \"id\": \"e21b8f3b-6230-4e72-beb1-094f243cf9fb\", \"area\": \"Gateway/AbInvoice\"}, {\"timeStamp\": \"2015-01-26 16:47:47.783\", \"serverName\": \"WEB4\", \"exceptionName\": \"Autofac.Core.DependencyResolutionException\", \"id\": \"f816589c-30b5-4f36-9e4c-536bea007b55\", \"area\": \"Gateway/Netaxept\"}, {\"timeStamp\": \"2015-01-25 12:12:07.583\", \"serverName\": \"WEB2\", \"exceptionName\": \"System.ArgumentNullException\", \"id\": \"a67a892b-33ca-42ea-8a2d-7663eb4815f3\", \"area\": \"Gateway/Winorg\"}, {\"timeStamp\": \"2015-01-26 07:45:57.975\", \"serverName\": \"WEB2\", \"exceptionName\": \"System.Web.HttpException\", \"id\": \"38783a00-adf2-4b89-9dbf-db193b7eb49f\", \"area\": \"Exception\"}, {\"timeStamp\": \"2015-01-25 08:08:24.098\", \"serverName\": \"WEB3\", \"exceptionName\": \"System.SystemException\", \"id\": \"275820c6-d352-45ac-8272-99906a6d84c0\", \"area\": \"Gateway/GestPay\"}, {\"timeStamp\": \"2015-01-26 10:09:25.221\", \"serverName\": \"WEB2\", \"exceptionName\": \"System.ArgumentException\", \"id\": \"c96df642-bc6f-4acd-985f-b90b60834b1f\", \"area\": \"Gateway/AbInvoice\"}, {\"timeStamp\": \"2015-01-26 20:39:50.130\", \"serverName\": \"WEB2\", \"exceptionName\": \"System.Web.HttpException\", \"id\": \"ae554048-7c38-4034-863a-e713b07c0ee7\", \"area\": \"ErrorMsg\"}, {\"timeStamp\": \"2015-01-25 03:45:40.554\", \"serverName\": \"WEB1\", \"exceptionName\": \"System.SystemException\", \"id\": \"48173f55-8a48-4c28-8812-673c20b2dd9b\", \"area\": \"Gateway/Winorg\"}, {\"timeStamp\": \"2015-01-26 20:32:20.685\", \"serverName\": \"WEB3\", \"exceptionName\": \"Amazon.S3.AmazonS3Exception\", \"id\": \"6a55017f-67c9-4eec-8fe3-c9b53481b7a6\", \"area\": \"Gateway/Com.AidBuilder.GatewayFacades.GatewayFacadeBase`1\"}, {\"timeStamp\": \"2015-01-26 15:01:01.345\", \"serverName\": \"WEB1\", \"exceptionName\": \"Autofac.Core.DependencyResolutionException\", \"id\": \"9406b316-e3a6-4fd1-baec-d74defc4a414\", \"area\": \"Gateway/Checkout\"}, {\"timeStamp\": \"2015-01-26 08:09:50.748\", \"serverName\": \"WEB3\", \"exceptionName\": \"Amazon.S3.AmazonS3Exception\", \"id\": \"90d3fbcb-7f2b-4400-8f5b-1aff4d73804b\", \"area\": \"Gateway/Dibs\"}, {\"timeStamp\": \"2015-01-25 15:37:24.184\", \"serverName\": \"WEB4\", \"exceptionName\": \"System.ArgumentException\", \"id\": \"3c21974e-3c4b-45fb-a64b-eefd391dc30e\", \"area\": \"Gateway/Paytrail\"}, {\"timeStamp\": \"2015-01-25 02:25:16.416\", \"serverName\": \"WEB3\", \"exceptionName\": \"Autofac.Core.DependencyResolutionException\", \"id\": \"f517c5f5-9368-4577-85f6-4425b1a8fc63\", \"area\": \"Gateway/GestPay\"}, {\"timeStamp\": \"2015-01-25 06:03:38.263\", \"serverName\": \"WEB2\", \"exceptionName\": \"Amazon.S3.AmazonS3Exception\", \"id\": \"91a0edeb-f42d-41d8-9abb-30dfb0982708\", \"area\": \"Exception\"}, {\"timeStamp\": \"2015-01-25 21:03:45.935\", \"serverName\": \"WEB2\", \"exceptionName\": \"System.ArgumentException\", \"id\": \"76381850-4f1a-4c3a-9b8c-a52f5733b51b\", \"area\": \"Gateway/Com.AidBuilder.GatewayFacades.GatewayFacadeBase`1\"}, {\"timeStamp\": \"2015-01-26 14:30:42.901\", \"serverName\": \"WEB4\", \"exceptionName\": \"System.Web.HttpException\", \"id\": \"130d1a5f-e61a-4835-b391-c845609adfcd\", \"area\": \"ErrorMsg\"}, {\"timeStamp\": \"2015-01-25 14:03:36.338\", \"serverName\": \"WEB2\", \"exceptionName\": \"System.Web.HttpException\", \"id\": \"be8c02d8-fe66-4901-8e56-130f1791be72\", \"area\": \"Gateway/Com.AidBuilder.GatewayFacades.GatewayFacadeBase`1\"}, {\"timeStamp\": \"2015-01-25 14:03:52.602\", \"serverName\": \"WEB2\", \"exceptionName\": \"Autofac.Core.DependencyResolutionException\", \"id\": \"162e6878-2b8d-495b-aa1b-d5ee03d7b2b2\", \"area\": \"ErrorMsg\"}, {\"timeStamp\": \"2015-01-26 19:45:09.804\", \"serverName\": \"WEB4\", \"exceptionName\": \"System.Web.HttpException\", \"id\": \"0c12ca46-0e80-4de6-9327-6ddf9082037b\", \"area\": \"Gateway/Checkout\"}, {\"timeStamp\": \"2015-01-26 01:58:34.876\", \"serverName\": \"WEB4\", \"exceptionName\": \"Amazon.S3.AmazonS3Exception\", \"id\": \"0b43260e-af07-4a4a-be1d-04a706c523bc\", \"area\": \"Gateway/Winorg\"}, {\"timeStamp\": \"2015-01-26 23:33:09.305\", \"serverName\": \"WEB4\", \"exceptionName\": \"System.Web.HttpException\", \"id\": \"64a305da-f207-4bf7-bbca-0fb10aa7b33c\", \"area\": \"Gateway/Paytrail\"}, {\"timeStamp\": \"2015-01-26 16:25:16.298\", \"serverName\": \"WEB1\", \"exceptionName\": \"System.ArgumentNullException\", \"id\": \"598115ea-6483-4ef5-84a3-91d9d508f79a\", \"area\": \"Gateway/Paytrail\"}, {\"timeStamp\": \"2015-01-25 20:23:13.731\", \"serverName\": \"WEB1\", \"exceptionName\": \"System.SystemException\", \"id\": \"d0727d6f-798a-4ac4-84c6-20e3f0b52334\", \"area\": \"Exception\"}, {\"timeStamp\": \"2015-01-26 15:02:00.276\", \"serverName\": \"WEB4\", \"exceptionName\": \"Autofac.Core.DependencyResolutionException\", \"id\": \"dd7ef44a-e404-470f-a17e-9cdaec3f696a\", \"area\": \"Gateway/GestPay\"}, {\"timeStamp\": \"2015-01-26 04:17:29.980\", \"serverName\": \"WEB3\", \"exceptionName\": \"System.ArgumentNullException\", \"id\": \"1e2f1da7-b151-43d0-98f2-f88d75684d23\", \"area\": \"Gateway/AbInvoice\"}, {\"timeStamp\": \"2015-01-25 18:14:48.546\", \"serverName\": \"WEB3\", \"exceptionName\": \"System.ArgumentNullException\", \"id\": \"ccf370f4-3b62-4f19-bc85-b162a9ad8b7e\", \"area\": \"Gateway/Checkout\"}, {\"timeStamp\": \"2015-01-26 07:04:16.238\", \"serverName\": \"WEB4\", \"exceptionName\": \"System.Web.HttpException\", \"id\": \"04424b79-6035-43ed-95b9-3c5e4602a630\", \"area\": \"Gateway/Checkout\"}, {\"timeStamp\": \"2015-01-26 16:05:16.606\", \"serverName\": \"WEB2\", \"exceptionName\": \"Autofac.Core.DependencyResolutionException\", \"id\": \"e8f74a9f-21f1-4b76-bb2d-a854f6311655\", \"area\": \"Gateway/Winorg\"}, {\"timeStamp\": \"2015-01-25 13:28:23.155\", \"serverName\": \"WEB2\", \"exceptionName\": \"Autofac.Core.DependencyResolutionException\", \"id\": \"2005b9b0-fb73-48df-95fa-195fb64a1c1b\", \"area\": \"Exception\"}, {\"timeStamp\": \"2015-01-25 17:31:10.812\", \"serverName\": \"WEB1\", \"exceptionName\": \"System.ArgumentNullException\", \"id\": \"c97e7a28-2ea2-4ac4-a62f-20a456bd682d\", \"area\": \"Gateway/PayEx\"}, {\"timeStamp\": \"2015-01-26 05:53:13.582\", \"serverName\": \"WEB2\", \"exceptionName\": \"System.ArgumentException\", \"id\": \"803ebd3d-c9f9-4ca8-8b6a-912d89b425e7\", \"area\": \"Gateway/GestPay\"}, {\"timeStamp\": \"2015-01-25 17:08:57.573\", \"serverName\": \"WEB1\", \"exceptionName\": \"System.ArgumentNullException\", \"id\": \"20d52520-2904-4841-b6c8-2e3d667a715e\", \"area\": \"Gateway/Netaxept\"}, {\"timeStamp\": \"2015-01-26 05:27:58.941\", \"serverName\": \"WEB3\", \"exceptionName\": \"System.SystemException\", \"id\": \"d732aafd-0785-480e-b9fa-ab7bb7bd68b8\", \"area\": \"Gateway/GestPay\"}, {\"timeStamp\": \"2015-01-26 13:30:24.155\", \"serverName\": \"WEB2\", \"exceptionName\": \"Amazon.S3.AmazonS3Exception\", \"id\": \"9ba4d530-ea8e-4e2f-bade-fe2bebf9e0b0\", \"area\": \"Gateway/Checkout\"}, {\"timeStamp\": \"2015-01-26 01:37:41.488\", \"serverName\": \"WEB2\", \"exceptionName\": \"System.ArgumentException\", \"id\": \"bee8e34a-9ea3-4c04-9cf4-e69313f02988\", \"area\": \"Gateway/Dibs\"}, {\"timeStamp\": \"2015-01-25 04:31:42.093\", \"serverName\": \"WEB1\", \"exceptionName\": \"Amazon.S3.AmazonS3Exception\", \"id\": \"7c5a23d8-ef82-44b5-b419-2c6da1424474\", \"area\": \"Gateway/PayPal\"}, {\"timeStamp\": \"2015-01-25 16:51:43.517\", \"serverName\": \"WEB4\", \"exceptionName\": \"System.ArgumentNullException\", \"id\": \"d98ec29c-b58f-4c24-9220-07dcdc1a3447\", \"area\": \"Gateway/AbInvoice\"}, {\"timeStamp\": \"2015-01-26 01:57:06.804\", \"serverName\": \"WEB3\", \"exceptionName\": \"Autofac.Core.DependencyResolutionException\", \"id\": \"a5dd1ab2-4d69-448d-ab8f-f6ab40198dfa\", \"area\": \"Gateway/Dibs\"}, {\"timeStamp\": \"2015-01-25 23:45:43.204\", \"serverName\": \"WEB4\", \"exceptionName\": \"System.SystemException\", \"id\": \"002c2914-cd6b-4aa3-b77f-d957d158974b\", \"area\": \"Exception\"}]}";
	
	@Override
	public <T> void getJson(String endpoint, Service<T> service) {
		
	}

	@Override
	public <T> void getJsonList(String endpoint, Service<T> service) {
		service.onRequestCompleted(service.deserializeList(responseAsText));
	}

	@Override
	public void post() {
		// TODO Auto-generated method stub
		
	}

}